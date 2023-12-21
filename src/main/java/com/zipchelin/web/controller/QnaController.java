package com.zipchelin.web.controller;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.zipchelin.model.dto.qna.QnaDto;
import com.zipchelin.model.dto.qna.QnaRequest;
import com.zipchelin.model.dto.qna.QnaResponse;
import com.zipchelin.model.service.QnaService;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
@RequestMapping("/community/qna*")
public class QnaController {
	
	private final QnaService qnaService;
	
	@GetMapping("")
    public String viewQna(@ModelAttribute("params") final QnaDto params, Model model) {
		List<QnaResponse> qna= qnaService.findAllQna(params);
		model.addAttribute("qna",qna);
        return "content/qna/qna";
    }
	
	@PostMapping("/upload")
    public String postQna() {
        return "content/qna/upload";
    }
	
	@GetMapping("/post/{num}")  // /qna/post/id값
    public String postQna(@PathVariable("num") Long id, Model model) {
		QnaResponse qna= qnaService.findQnaById(id);
		model.addAttribute("qna",qna);
        return "content/qna/qna_post";
    }
	
	@GetMapping("/form")
    public String saveFormQna(@RequestParam(value="id",required = false) final Long id,Model model) {
			if(id!=null) {
				QnaResponse qna = qnaService.findQnaById(id);
				model.addAttribute("qna",qna);
			}
        return "content/qna/qna_form";
    }
	
	@PostMapping("/save")
	public String saveQna(final QnaRequest params) {
		qnaService.saveQna(params);
		return "redirect:/community/qna/";
	}
	
	@GetMapping("/delete/{num}")
	public String deleteQna(@PathVariable("num") final Long id) {
		qnaService.deleteQna(id);
		return "redirect:/community/qna/";
	}
	
	@GetMapping("/update/{num}")
	public String updateFormQna(@PathVariable("num") final Long id,Model model) {
		if(id!=null) {
			QnaResponse qna = qnaService.findQnaById(id);
			model.addAttribute("qna",qna);
		}
		return "content/qna/qna_update";
	}
	
	@PostMapping("/update1/{num}")
	public String updateQna(@PathVariable("num") final QnaRequest params,HttpServletRequest request) throws IOException {
		qnaService.updateQna(params);
		String fileInfo = "";
	    String fileName = request.getHeader("file-name");
	    String fileName_suffix = fileName.substring(fileName.lastIndexOf(".") + 1).toLowerCase();
	    String[] suffixArr = { "jpg", "png", "bmp", "gif" };
	 
	    int cnt = 0;
	    for (int i = 0; i < suffixArr.length; i++) {
	        if (fileName_suffix.equals(suffixArr[i])) {
	            cnt++;
	        }
	    }
	 
	    if (cnt == 0) {
//	        out.println("NOTALLOW_" + fileName);
	    } else {
	        String defaultPath = request.getSession().getServletContext().getRealPath("/");
	        String filePath = defaultPath + "img" + File.separator + "smarteditor" + 
	        					File.separator;
	        File file = new File(filePath);
	        if (!file.exists()) {
	            file.mkdirs();
	        }
	        String autoFileName = UUID.randomUUID().toString() + 
	        						fileName.substring(fileName.lastIndexOf("."));
	        String rFileName = filePath + autoFileName;
	        InputStream is = request.getInputStream();
	        OutputStream os = new FileOutputStream(rFileName);
	        int num;
	        byte b[] = new byte[Integer.parseInt(request.getHeader("file-size"))];
	        while ((num = is.read(b, 0, b.length)) != -1) {
	            os.write(b, 0, num);
	        }
	        if (is != null) {
	            is.close();
	        }
	        os.flush();
	        os.close();
	 
	        fileInfo += "&bNewLine=true";    
	        fileInfo += "&sFileName=" + fileName;    
	        fileInfo += "&sFileURL=/img/smarteditor/"+autoFileName;
//	        out.println(fileInfo);
	    }
		return "/community/qna/qna";
	}
	
}
