package concrete;

import abstracts.CampaignService;
import entity.Campaign;

public class CampaignManager implements CampaignService {
    @Override
    public boolean addCampaign(Campaign campaign) {
        System.out.println("Successfully added : " + campaign.getName());
        return true;
    }

    @Override
    public boolean removeCampaign(Integer campaignId) {
        if (campaignId != null) {
            System.out.println("Successfully removed.");
            return true;
        } else {
            System.out.println("There is no such id.");
            return false;
        }
    }

    @Override
    public boolean updateCampaign(Campaign campaign) {
        System.out.println("Successfully updated : " + campaign.getName());
        return true;
    }
}
