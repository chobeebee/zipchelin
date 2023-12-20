package com.zipchelin.model.dto.member;

import com.zipchelin.model.service.MemberService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

import java.util.Timer;
import java.util.TimerTask;

@Slf4j
@Component
@RequiredArgsConstructor
public class EmailEventListener {

    @Async
    @EventListener
    public void listen(EmailApplicationEvent event) {
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                MemberService.codeStore.remove(event.getEmail());
                timer.cancel();
                log.info("3분 경과, 이메일 삭제 = {}", MemberService.codeStore);
            }
        }, 3 * 60 * 1000);
    }
}

