package com.example.contact;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

import static java.time.LocalTime.now;

@RestController
@RequestMapping("api/v1/contact-form")
public class ContactFormController {
    @GetMapping
    public List<ContactForm> getContactForm ()
    {
        //String idNumber, Date dateOfBirth, String gender
        return List.of(
                new ContactForm(
                        1,
                        "Kenya",
                        "Isaiah Oduor",
                        "0797658959",
                        "isaiahoduor41@gmail.com",
                        "35187656",
                        new Date(),
                        "Male"
                ),
                new ContactForm(
                        2,
                        "Uganda",
                        "Joseph Olloo",
                        "0788909876",
                        "josepholloo41@gmail.com",
                        "35187656",
                        new Date(),
                        "Male"
                )
        );
    }
}
