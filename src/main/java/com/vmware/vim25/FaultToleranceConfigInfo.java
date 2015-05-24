package com.vmware.vim25;

/**
 * @author Steve Jin (http://www.doublecloud.org)
 * @version 5.1
 */

public class FaultToleranceConfigInfo extends DynamicData {
    public int role;
    public String[] instanceUuids;
    public String[] configPaths;
    public Boolean orphaned;

    public int getRole() {
        return this.role;
    }

    public void setRole(int role) {
        this.role = role;
    }

    public String[] getInstanceUuids() {
        return this.instanceUuids;
    }

    public void setInstanceUuids(String[] instanceUuids) {
        this.instanceUuids = instanceUuids;
    }

    public String[] getConfigPaths() {
        return this.configPaths;
    }

    public void setConfigPaths(String[] configPaths) {
        this.configPaths = configPaths;
    }

    public Boolean getOrphaned() {
        return this.orphaned;
    }

    public void setOrphaned(Boolean orphaned) {
        this.orphaned = orphaned;
    }

}
