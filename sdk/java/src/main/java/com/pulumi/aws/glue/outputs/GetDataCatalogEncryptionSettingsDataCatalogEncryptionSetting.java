// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.glue.outputs;

import com.pulumi.aws.glue.outputs.GetDataCatalogEncryptionSettingsDataCatalogEncryptionSettingConnectionPasswordEncryption;
import com.pulumi.aws.glue.outputs.GetDataCatalogEncryptionSettingsDataCatalogEncryptionSettingEncryptionAtRest;
import com.pulumi.core.annotations.CustomType;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetDataCatalogEncryptionSettingsDataCatalogEncryptionSetting {
    /**
     * @return When connection password protection is enabled, the Data Catalog uses a customer-provided key to encrypt the password as part of CreateConnection or UpdateConnection and store it in the ENCRYPTED_PASSWORD field in the connection properties. You can enable catalog encryption or only password encryption. see Connection Password Encryption.
     * 
     */
    private List<GetDataCatalogEncryptionSettingsDataCatalogEncryptionSettingConnectionPasswordEncryption> connectionPasswordEncryptions;
    /**
     * @return Specifies the encryption-at-rest configuration for the Data Catalog. see Encryption At Rest.
     * 
     */
    private List<GetDataCatalogEncryptionSettingsDataCatalogEncryptionSettingEncryptionAtRest> encryptionAtRests;

    private GetDataCatalogEncryptionSettingsDataCatalogEncryptionSetting() {}
    /**
     * @return When connection password protection is enabled, the Data Catalog uses a customer-provided key to encrypt the password as part of CreateConnection or UpdateConnection and store it in the ENCRYPTED_PASSWORD field in the connection properties. You can enable catalog encryption or only password encryption. see Connection Password Encryption.
     * 
     */
    public List<GetDataCatalogEncryptionSettingsDataCatalogEncryptionSettingConnectionPasswordEncryption> connectionPasswordEncryptions() {
        return this.connectionPasswordEncryptions;
    }
    /**
     * @return Specifies the encryption-at-rest configuration for the Data Catalog. see Encryption At Rest.
     * 
     */
    public List<GetDataCatalogEncryptionSettingsDataCatalogEncryptionSettingEncryptionAtRest> encryptionAtRests() {
        return this.encryptionAtRests;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDataCatalogEncryptionSettingsDataCatalogEncryptionSetting defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<GetDataCatalogEncryptionSettingsDataCatalogEncryptionSettingConnectionPasswordEncryption> connectionPasswordEncryptions;
        private List<GetDataCatalogEncryptionSettingsDataCatalogEncryptionSettingEncryptionAtRest> encryptionAtRests;
        public Builder() {}
        public Builder(GetDataCatalogEncryptionSettingsDataCatalogEncryptionSetting defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.connectionPasswordEncryptions = defaults.connectionPasswordEncryptions;
    	      this.encryptionAtRests = defaults.encryptionAtRests;
        }

        @CustomType.Setter
        public Builder connectionPasswordEncryptions(List<GetDataCatalogEncryptionSettingsDataCatalogEncryptionSettingConnectionPasswordEncryption> connectionPasswordEncryptions) {
            this.connectionPasswordEncryptions = Objects.requireNonNull(connectionPasswordEncryptions);
            return this;
        }
        public Builder connectionPasswordEncryptions(GetDataCatalogEncryptionSettingsDataCatalogEncryptionSettingConnectionPasswordEncryption... connectionPasswordEncryptions) {
            return connectionPasswordEncryptions(List.of(connectionPasswordEncryptions));
        }
        @CustomType.Setter
        public Builder encryptionAtRests(List<GetDataCatalogEncryptionSettingsDataCatalogEncryptionSettingEncryptionAtRest> encryptionAtRests) {
            this.encryptionAtRests = Objects.requireNonNull(encryptionAtRests);
            return this;
        }
        public Builder encryptionAtRests(GetDataCatalogEncryptionSettingsDataCatalogEncryptionSettingEncryptionAtRest... encryptionAtRests) {
            return encryptionAtRests(List.of(encryptionAtRests));
        }
        public GetDataCatalogEncryptionSettingsDataCatalogEncryptionSetting build() {
            final var o = new GetDataCatalogEncryptionSettingsDataCatalogEncryptionSetting();
            o.connectionPasswordEncryptions = connectionPasswordEncryptions;
            o.encryptionAtRests = encryptionAtRests;
            return o;
        }
    }
}
