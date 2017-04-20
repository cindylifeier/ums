package gov.samhsa.c2s.ums.service.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Pattern;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AddressDto {

    /**
     * The street address line.
     */
    private String streetAddressLine;

    /**
     * The city.
     */
    private String city;

    /**
     * The state code.
     */
    private String stateCode;

    /**
     * The postal code.
     */
    @Pattern(regexp = "\\d{5}(?:[-\\s]\\d{4})?")
    private String postalCode;

    /**
     * The country code.
     */
    private String countryCode;
}
