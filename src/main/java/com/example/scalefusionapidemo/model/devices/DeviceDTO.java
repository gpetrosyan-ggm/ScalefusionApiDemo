package com.example.scalefusionapidemo.model.devices;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class DeviceDTO {

    @JsonProperty("id")
    private Long id;

    @JsonProperty("name")
    private String name;

    @JsonProperty("battery_status")
    private Integer batteryStatus;

    @JsonProperty("battery_charging")
    private Boolean batteryCharging;

    @JsonProperty("serial_no")
    private String serialNo;

    @JsonProperty("imei_no")
    private String imeiNo;

    @JsonProperty("status")
    private String status;

    @JsonProperty("model")
    private String model;

    @JsonProperty("make")
    private String make;

    @JsonProperty("os_version")
    private String osVersion;

    @JsonProperty("app_version_name")
    private String appVersionName;

    @JsonProperty("android_id")
    private String androidId;

    @JsonProperty("udid")
    private String udid;

    @JsonProperty("in_trial")
    private Boolean inTrial;

    @JsonProperty("licence_active")
    private Boolean licenceActive;

    @JsonProperty("licence_expires_at")
    private LocalDateTime licenceExpiresAt;

    @JsonProperty("locked")
    private Boolean locked;

    @JsonProperty("last_connected_at")
    private LocalDateTime lastConnectedAt;

    @JsonProperty("wifi_mac_address")
    private String wifiMacAddress;

    @JsonProperty("ip_address")
    private String ipAddress;

    @JsonProperty("bluetooth_mac")
    private String bluetoothMac;

    @JsonProperty("rooted")
    private String rooted;

    @JsonProperty("enrollment_method")
    private String enrollmentMethod;

    @JsonProperty("enrollment_date")
    private LocalDateTime enrollmentDate;

    @JsonProperty("gsuite_account")
    private String gsuiteAccount;

    @JsonProperty("build_serial_no")
    private String buildSerialNo;

    @JsonProperty("gsm_serial_no")
    private String gsmSerialNo;

    @JsonProperty("iccid_no")
    private String iccidNo;

    @JsonProperty("phone_no")
    private String phoneNo;

    @JsonProperty("os_type")
    private String osType;

    @JsonProperty("custom_properties")
    private List<DeviceCustomPropertiesDTO> customProperties;

    @JsonProperty("location")
    private DeviceLocationDTO location;

    @JsonProperty("profile")
    private DeviceProfileDTO profile;

    @JsonProperty("group")
    private DeviceGroupDTO group;

    @JsonProperty("storage_info")
    private DeviceStorageDTO storageInfo;

}
