package com.mycompany.hr.holidayService;

import java.util.Date;
import org.springframework.stereotype.Service;

@Service
public class HumanResourceService {
    public void bookHoliday(Date startDate, Date endDate, String name) {
        System.out.println("Booking holiday for [" + startDate + "-" + endDate + "] for [" + name + "] ");
    }
}
