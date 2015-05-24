package com.vmware.vim25;

/**
 * @author Steve Jin (http://www.doublecloud.org)
 * @version 5.1
 */

public class ClusterRuleInfo extends DynamicData {
    public Integer key;
    public ManagedEntityStatus status;
    public Boolean enabled;
    public String name;
    public Boolean mandatory;
    public Boolean userCreated;
    public Boolean inCompliance;
    public String ruleUuid;

    public Integer getKey() {
        return this.key;
    }

    public void setKey(Integer key) {
        this.key = key;
    }

    public ManagedEntityStatus getStatus() {
        return this.status;
    }

    public void setStatus(ManagedEntityStatus status) {
        this.status = status;
    }

    public Boolean getEnabled() {
        return this.enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getMandatory() {
        return this.mandatory;
    }

    public void setMandatory(Boolean mandatory) {
        this.mandatory = mandatory;
    }

    public Boolean getUserCreated() {
        return this.userCreated;
    }

    public void setUserCreated(Boolean userCreated) {
        this.userCreated = userCreated;
    }

    public Boolean getInCompliance() {
        return this.inCompliance;
    }

    public void setInCompliance(Boolean inCompliance) {
        this.inCompliance = inCompliance;
    }

    public String getRuleUuid() {
        return this.ruleUuid;
    }

    public void setRuleUuid(String ruleUuid) {
        this.ruleUuid = ruleUuid;
    }

}
