package finalmission.dto.request;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.time.LocalDate;

public record ReservationCreateRequest(
        @JsonFormat(pattern = "yyyy:MM:dd") LocalDate date,
        Long memberId,
        Long sportId,
        Long timeId
) {
}
