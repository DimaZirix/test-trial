package com.pocketm.domain.dto.hotel.giata;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@ToString
@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class GiataHotelDTO {

    @JsonProperty("PDFfile")
    private String PDFfile;

    @JsonProperty("Hotelname")
    private String hotelname;

    @JsonProperty("Hotelkategorie")
    private String hotelkategorie;

    @JsonProperty("Stadtname")
    private String stadtname;

    @JsonProperty("Zielgebietsname")
    private String zielgebietsname;

    @JsonProperty("Stadtnummer")
    private Integer stadtnummer;

    @JsonProperty("Zielgebietsnummer")
    private Integer zielgebietsnummer;

    @JsonProperty("Landname")
    private String landname;

    @JsonProperty("Landcode")
    private String landcode;

    @JsonProperty("Veranstaltercode")
    private String veranstaltercode;

    @JsonProperty("datestart")
    private String datestart;

    @JsonProperty("dateend")
    private String dateend;

    @JsonProperty("GeoData")
    private GeoDataGiataHotelDTO geoData;

    @JsonProperty("Objectcode")
    private String objectcode;

    @JsonProperty("Objectcodes")
    private ObjectcodesGiataHotelDTO objectcodes;

    @JsonProperty("Text")
    private TextGiataHotelDTO text;

    @JsonProperty("Landkarte")
    private String landkarte;

    //@JsonProperty("climate")
    //private ClimateGiataHotelDTO climate;

    @JsonProperty("KatalogID")
    private Integer katalogID;

    @JsonProperty("Katalogseite")
    private Integer katalogseite;

    @JsonProperty("Preisseite")
    private Integer preisseite;

    @JsonProperty("Katalogname")
    private String katalogname;

    @JsonProperty("Veranstaltername")
    private String veranstaltername;

    @JsonProperty("VeranstalterID")
    private Integer veranstalterID;

    @JsonProperty("KataloghotelID")
    private Integer kataloghotelID;

    @JsonProperty("KatalogSaisonTyp")
    private Integer katalogSaisonTyp;

    //@JsonProperty("Bildfile")
    //private BildfileGiataHotelDTO bildfile;

    @JsonProperty("Textfile")
    private String textfile;

    @JsonProperty("Klimagrafik")
    private String klimagrafik;

    @JsonProperty("AGB")
    private String AGB;

    @JsonProperty("TDS")
    private String TDS;
    
}
