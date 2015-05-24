package com.vmware.vim25;

import java.util.Calendar;

/**
 * @author Steve Jin (http://www.doublecloud.org)
 * @version 5.1
 */

public class ClusterRecommendation extends DynamicData {
    public String key;
    public String type;
    public Calendar time;
    public int rating;
    public String reason;
    public String reasonText;
    public String warningText;
    public LocalizableMessage warningDetails;
    public String[] prerequisite;
    public ClusterAction[] action;
    public ManagedObjectReference target;

    public String getKey() {
        return this.key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Calendar getTime() {
        return this.time;
    }

    public void setTime(Calendar time) {
        this.time = time;
    }

    public int getRating() {
        return this.rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getReason() {
        return this.reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getReasonText() {
        return this.reasonText;
    }

    public void setReasonText(String reasonText) {
        this.reasonText = reasonText;
    }

    public String getWarningText() {
        return this.warningText;
    }

    public void setWarningText(String warningText) {
        this.warningText = warningText;
    }

    public LocalizableMessage getWarningDetails() {
        return this.warningDetails;
    }

    public void setWarningDetails(LocalizableMessage warningDetails) {
        this.warningDetails = warningDetails;
    }

    public String[] getPrerequisite() {
        return this.prerequisite;
    }

    public void setPrerequisite(String[] prerequisite) {
        this.prerequisite = prerequisite;
    }

    public ClusterAction[] getAction() {
        return this.action;
    }

    public void setAction(ClusterAction[] action) {
        this.action = action;
    }

    public ManagedObjectReference getTarget() {
        return this.target;
    }

    public void setTarget(ManagedObjectReference target) {
        this.target = target;
    }

}
