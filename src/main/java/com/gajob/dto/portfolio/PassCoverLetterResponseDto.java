package com.gajob.dto.portfolio;

import com.gajob.entity.portfolio.PassCoverLetter;
import lombok.Data;

import java.util.Set;

@Data
public class PassCoverLetterResponseDto {

    private Long id;
    private String companyName;
    private String workType;
    private String objective;
    private Set specifications;
    private String url;
    private String imgUrl;

    public PassCoverLetterResponseDto(PassCoverLetter passCoverLetter) {
        this.id = passCoverLetter.getId();
        this.companyName = passCoverLetter.getCompanyName();
        this.workType = passCoverLetter.getWorkType();
        this.objective = passCoverLetter.getObjective();
        this.specifications = passCoverLetter.getSpecifications();
        this.url = passCoverLetter.getUrl();
        this.imgUrl = passCoverLetter.getImgUrl();
    }
}
