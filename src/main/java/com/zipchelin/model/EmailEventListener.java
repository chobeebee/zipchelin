package com.zipchelin.model;

import com.zipchelin.model.service.MemberService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

@Slf4j
@Component
@RequiredArgsConstructor
public class EmailEventListener {

    @Async
    @EventListener
    public void listen(EmailApplicationEvent event) {

        ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);

        scheduler.schedule(() -> {
            MemberService.codeStore.remove(event.getEmail());
            log.info("3분 경과, 이메일 삭제 = {}", MemberService.codeStore);
            scheduler.shutdown();
        }, 3, TimeUnit.MINUTES);
    }
}

