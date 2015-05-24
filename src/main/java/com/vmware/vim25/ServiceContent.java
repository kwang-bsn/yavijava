package com.vmware.vim25;

/**
 * Created by Michael Rice on Sun May 24 07:03:52 CDT 2015
 * <p/>
 * Copyright 2015 Michael Rice
 * <p/>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p/>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p/>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * @since 6.0
 */

public class ServiceContent extends DynamicData {
    public ManagedObjectReference rootFolder;
    public ManagedObjectReference propertyCollector;
    public ManagedObjectReference viewManager;
    public AboutInfo about;
    public ManagedObjectReference setting;
    public ManagedObjectReference userDirectory;
    public ManagedObjectReference sessionManager;
    public ManagedObjectReference authorizationManager;
    public ManagedObjectReference serviceManager;
    public ManagedObjectReference perfManager;
    public ManagedObjectReference scheduledTaskManager;
    public ManagedObjectReference alarmManager;
    public ManagedObjectReference eventManager;
    public ManagedObjectReference taskManager;
    public ManagedObjectReference extensionManager;
    public ManagedObjectReference customizationSpecManager;
    public ManagedObjectReference customFieldsManager;
    public ManagedObjectReference accountManager;
    public ManagedObjectReference diagnosticManager;
    public ManagedObjectReference licenseManager;
    public ManagedObjectReference searchIndex;
    public ManagedObjectReference fileManager;
    public ManagedObjectReference datastoreNamespaceManager;
    public ManagedObjectReference virtualDiskManager;
    public ManagedObjectReference virtualizationManager;
    public ManagedObjectReference snmpSystem;
    public ManagedObjectReference vmProvisioningChecker;
    public ManagedObjectReference vmCompatibilityChecker;
    public ManagedObjectReference ovfManager;
    public ManagedObjectReference ipPoolManager;
    public ManagedObjectReference dvSwitchManager;
    public ManagedObjectReference hostProfileManager;
    public ManagedObjectReference clusterProfileManager;
    public ManagedObjectReference complianceManager;
    public ManagedObjectReference localizationManager;
    public ManagedObjectReference storageResourceManager;
    public ManagedObjectReference guestOperationsManager;
    public ManagedObjectReference overheadMemoryManager;
    public ManagedObjectReference certificateManager;
    public ManagedObjectReference ioFilterManager;

    public ManagedObjectReference getRootFolder() {
        return this.rootFolder;
    }

    public void setRootFolder(ManagedObjectReference rootFolder) {
        this.rootFolder = rootFolder;
    }

    public ManagedObjectReference getPropertyCollector() {
        return this.propertyCollector;
    }

    public void setPropertyCollector(ManagedObjectReference propertyCollector) {
        this.propertyCollector = propertyCollector;
    }

    public ManagedObjectReference getViewManager() {
        return this.viewManager;
    }

    public void setViewManager(ManagedObjectReference viewManager) {
        this.viewManager = viewManager;
    }

    public AboutInfo getAbout() {
        return this.about;
    }

    public void setAbout(AboutInfo about) {
        this.about = about;
    }

    public ManagedObjectReference getSetting() {
        return this.setting;
    }

    public void setSetting(ManagedObjectReference setting) {
        this.setting = setting;
    }

    public ManagedObjectReference getUserDirectory() {
        return this.userDirectory;
    }

    public void setUserDirectory(ManagedObjectReference userDirectory) {
        this.userDirectory = userDirectory;
    }

    public ManagedObjectReference getSessionManager() {
        return this.sessionManager;
    }

    public void setSessionManager(ManagedObjectReference sessionManager) {
        this.sessionManager = sessionManager;
    }

    public ManagedObjectReference getAuthorizationManager() {
        return this.authorizationManager;
    }

    public void setAuthorizationManager(ManagedObjectReference authorizationManager) {
        this.authorizationManager = authorizationManager;
    }

    public ManagedObjectReference getServiceManager() {
        return this.serviceManager;
    }

    public void setServiceManager(ManagedObjectReference serviceManager) {
        this.serviceManager = serviceManager;
    }

    public ManagedObjectReference getPerfManager() {
        return this.perfManager;
    }

    public void setPerfManager(ManagedObjectReference perfManager) {
        this.perfManager = perfManager;
    }

    public ManagedObjectReference getScheduledTaskManager() {
        return this.scheduledTaskManager;
    }

    public void setScheduledTaskManager(ManagedObjectReference scheduledTaskManager) {
        this.scheduledTaskManager = scheduledTaskManager;
    }

    public ManagedObjectReference getAlarmManager() {
        return this.alarmManager;
    }

    public void setAlarmManager(ManagedObjectReference alarmManager) {
        this.alarmManager = alarmManager;
    }

    public ManagedObjectReference getEventManager() {
        return this.eventManager;
    }

    public void setEventManager(ManagedObjectReference eventManager) {
        this.eventManager = eventManager;
    }

    public ManagedObjectReference getTaskManager() {
        return this.taskManager;
    }

    public void setTaskManager(ManagedObjectReference taskManager) {
        this.taskManager = taskManager;
    }

    public ManagedObjectReference getExtensionManager() {
        return this.extensionManager;
    }

    public void setExtensionManager(ManagedObjectReference extensionManager) {
        this.extensionManager = extensionManager;
    }

    public ManagedObjectReference getCustomizationSpecManager() {
        return this.customizationSpecManager;
    }

    public void setCustomizationSpecManager(ManagedObjectReference customizationSpecManager) {
        this.customizationSpecManager = customizationSpecManager;
    }

    public ManagedObjectReference getCustomFieldsManager() {
        return this.customFieldsManager;
    }

    public void setCustomFieldsManager(ManagedObjectReference customFieldsManager) {
        this.customFieldsManager = customFieldsManager;
    }

    public ManagedObjectReference getAccountManager() {
        return this.accountManager;
    }

    public void setAccountManager(ManagedObjectReference accountManager) {
        this.accountManager = accountManager;
    }

    public ManagedObjectReference getDiagnosticManager() {
        return this.diagnosticManager;
    }

    public void setDiagnosticManager(ManagedObjectReference diagnosticManager) {
        this.diagnosticManager = diagnosticManager;
    }

    public ManagedObjectReference getLicenseManager() {
        return this.licenseManager;
    }

    public void setLicenseManager(ManagedObjectReference licenseManager) {
        this.licenseManager = licenseManager;
    }

    public ManagedObjectReference getSearchIndex() {
        return this.searchIndex;
    }

    public void setSearchIndex(ManagedObjectReference searchIndex) {
        this.searchIndex = searchIndex;
    }

    public ManagedObjectReference getFileManager() {
        return this.fileManager;
    }

    public void setFileManager(ManagedObjectReference fileManager) {
        this.fileManager = fileManager;
    }

    public ManagedObjectReference getDatastoreNamespaceManager() {
        return this.datastoreNamespaceManager;
    }

    public void setDatastoreNamespaceManager(ManagedObjectReference datastoreNamespaceManager) {
        this.datastoreNamespaceManager = datastoreNamespaceManager;
    }

    public ManagedObjectReference getVirtualDiskManager() {
        return this.virtualDiskManager;
    }

    public void setVirtualDiskManager(ManagedObjectReference virtualDiskManager) {
        this.virtualDiskManager = virtualDiskManager;
    }

    public ManagedObjectReference getVirtualizationManager() {
        return this.virtualizationManager;
    }

    public void setVirtualizationManager(ManagedObjectReference virtualizationManager) {
        this.virtualizationManager = virtualizationManager;
    }

    public ManagedObjectReference getSnmpSystem() {
        return this.snmpSystem;
    }

    public void setSnmpSystem(ManagedObjectReference snmpSystem) {
        this.snmpSystem = snmpSystem;
    }

    public ManagedObjectReference getVmProvisioningChecker() {
        return this.vmProvisioningChecker;
    }

    public void setVmProvisioningChecker(ManagedObjectReference vmProvisioningChecker) {
        this.vmProvisioningChecker = vmProvisioningChecker;
    }

    public ManagedObjectReference getVmCompatibilityChecker() {
        return this.vmCompatibilityChecker;
    }

    public void setVmCompatibilityChecker(ManagedObjectReference vmCompatibilityChecker) {
        this.vmCompatibilityChecker = vmCompatibilityChecker;
    }

    public ManagedObjectReference getOvfManager() {
        return this.ovfManager;
    }

    public void setOvfManager(ManagedObjectReference ovfManager) {
        this.ovfManager = ovfManager;
    }

    public ManagedObjectReference getIpPoolManager() {
        return this.ipPoolManager;
    }

    public void setIpPoolManager(ManagedObjectReference ipPoolManager) {
        this.ipPoolManager = ipPoolManager;
    }

    public ManagedObjectReference getDvSwitchManager() {
        return this.dvSwitchManager;
    }

    public void setDvSwitchManager(ManagedObjectReference dvSwitchManager) {
        this.dvSwitchManager = dvSwitchManager;
    }

    public ManagedObjectReference getHostProfileManager() {
        return this.hostProfileManager;
    }

    public void setHostProfileManager(ManagedObjectReference hostProfileManager) {
        this.hostProfileManager = hostProfileManager;
    }

    public ManagedObjectReference getClusterProfileManager() {
        return this.clusterProfileManager;
    }

    public void setClusterProfileManager(ManagedObjectReference clusterProfileManager) {
        this.clusterProfileManager = clusterProfileManager;
    }

    public ManagedObjectReference getComplianceManager() {
        return this.complianceManager;
    }

    public void setComplianceManager(ManagedObjectReference complianceManager) {
        this.complianceManager = complianceManager;
    }

    public ManagedObjectReference getLocalizationManager() {
        return this.localizationManager;
    }

    public void setLocalizationManager(ManagedObjectReference localizationManager) {
        this.localizationManager = localizationManager;
    }

    public ManagedObjectReference getStorageResourceManager() {
        return this.storageResourceManager;
    }

    public void setStorageResourceManager(ManagedObjectReference storageResourceManager) {
        this.storageResourceManager = storageResourceManager;
    }

    public ManagedObjectReference getGuestOperationsManager() {
        return this.guestOperationsManager;
    }

    public void setGuestOperationsManager(ManagedObjectReference guestOperationsManager) {
        this.guestOperationsManager = guestOperationsManager;
    }

    public ManagedObjectReference getOverheadMemoryManager() {
        return this.overheadMemoryManager;
    }

    public void setOverheadMemoryManager(ManagedObjectReference overheadMemoryManager) {
        this.overheadMemoryManager = overheadMemoryManager;
    }

    public ManagedObjectReference getCertificateManager() {
        return this.certificateManager;
    }

    public void setCertificateManager(ManagedObjectReference certificateManager) {
        this.certificateManager = certificateManager;
    }

    public ManagedObjectReference getIoFilterManager() {
        return this.ioFilterManager;
    }

    public void setIoFilterManager(ManagedObjectReference ioFilterManager) {
        this.ioFilterManager = ioFilterManager;
    }

}
