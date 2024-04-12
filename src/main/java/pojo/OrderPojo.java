package pojo;


import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class OrderPojo {
    private int id;
    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate date;
}
