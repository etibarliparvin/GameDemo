package abstracts;

import entity.Campaign;

public interface CampaignService {
    boolean addCampaign(Campaign campaign);

    boolean removeCampaign(Integer campaignId);

    boolean updateCampaign(Campaign campaign);
}
