// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.glue.outputs;

import com.pulumi.aws.glue.outputs.GetDataCatalogEncryptionSettingsDataCatalogEncryptionSetting;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetDataCatalogEncryptionSettingsResult {
    private String catalogId;
    /**
     * @return The security configuration to set. see Data Catalog Encryption Settings.
     * 
     */
    private List<GetDataCatalogEncryptionSettingsDataCatalogEncryptionSetting> dataCatalogEncryptionSettings;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;

    private GetDataCatalogEncryptionSettingsResult() {}
    public String catalogId() {
        return this.catalogId;
    }
    /**
     * @return The security configuration to set. see Data Catalog Encryption Settings.
     * 
     */
    public List<GetDataCatalogEncryptionSettingsDataCatalogEncryptionSetting> dataCatalogEncryptionSettings() {
        return this.dataCatalogEncryptionSettings;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDataCatalogEncryptionSettingsResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String catalogId;
        private List<GetDataCatalogEncryptionSettingsDataCatalogEncryptionSetting> dataCatalogEncryptionSettings;
        private String id;
        public Builder() {}
        public Builder(GetDataCatalogEncryptionSettingsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.catalogId = defaults.catalogId;
    	      this.dataCatalogEncryptionSettings = defaults.dataCatalogEncryptionSettings;
    	      this.id = defaults.id;
        }

        @CustomType.Setter
        public Builder catalogId(String catalogId) {
            this.catalogId = Objects.requireNonNull(catalogId);
            return this;
        }
        @CustomType.Setter
        public Builder dataCatalogEncryptionSettings(List<GetDataCatalogEncryptionSettingsDataCatalogEncryptionSetting> dataCatalogEncryptionSettings) {
            this.dataCatalogEncryptionSettings = Objects.requireNonNull(dataCatalogEncryptionSettings);
            return this;
        }
        public Builder dataCatalogEncryptionSettings(GetDataCatalogEncryptionSettingsDataCatalogEncryptionSetting... dataCatalogEncryptionSettings) {
            return dataCatalogEncryptionSettings(List.of(dataCatalogEncryptionSettings));
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public GetDataCatalogEncryptionSettingsResult build() {
            final var o = new GetDataCatalogEncryptionSettingsResult();
            o.catalogId = catalogId;
            o.dataCatalogEncryptionSettings = dataCatalogEncryptionSettings;
            o.id = id;
            return o;
        }
    }
}
