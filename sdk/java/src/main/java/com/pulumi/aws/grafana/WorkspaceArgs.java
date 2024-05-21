// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.grafana;

import com.pulumi.aws.grafana.inputs.WorkspaceNetworkAccessControlArgs;
import com.pulumi.aws.grafana.inputs.WorkspaceVpcConfigurationArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class WorkspaceArgs extends com.pulumi.resources.ResourceArgs {

    public static final WorkspaceArgs Empty = new WorkspaceArgs();

    /**
     * The type of account access for the workspace. Valid values are `CURRENT_ACCOUNT` and `ORGANIZATION`. If `ORGANIZATION` is specified, then `organizational_units` must also be present.
     * 
     */
    @Import(name="accountAccessType", required=true)
    private Output<String> accountAccessType;

    /**
     * @return The type of account access for the workspace. Valid values are `CURRENT_ACCOUNT` and `ORGANIZATION`. If `ORGANIZATION` is specified, then `organizational_units` must also be present.
     * 
     */
    public Output<String> accountAccessType() {
        return this.accountAccessType;
    }

    /**
     * The authentication providers for the workspace. Valid values are `AWS_SSO`, `SAML`, or both.
     * 
     */
    @Import(name="authenticationProviders", required=true)
    private Output<List<String>> authenticationProviders;

    /**
     * @return The authentication providers for the workspace. Valid values are `AWS_SSO`, `SAML`, or both.
     * 
     */
    public Output<List<String>> authenticationProviders() {
        return this.authenticationProviders;
    }

    /**
     * The configuration string for the workspace that you create. For more information about the format and configuration options available, see [Working in your Grafana workspace](https://docs.aws.amazon.com/grafana/latest/userguide/AMG-configure-workspace.html).
     * 
     */
    @Import(name="configuration")
    private @Nullable Output<String> configuration;

    /**
     * @return The configuration string for the workspace that you create. For more information about the format and configuration options available, see [Working in your Grafana workspace](https://docs.aws.amazon.com/grafana/latest/userguide/AMG-configure-workspace.html).
     * 
     */
    public Optional<Output<String>> configuration() {
        return Optional.ofNullable(this.configuration);
    }

    /**
     * The data sources for the workspace. Valid values are `AMAZON_OPENSEARCH_SERVICE`, `ATHENA`, `CLOUDWATCH`, `PROMETHEUS`, `REDSHIFT`, `SITEWISE`, `TIMESTREAM`, `XRAY`
     * 
     */
    @Import(name="dataSources")
    private @Nullable Output<List<String>> dataSources;

    /**
     * @return The data sources for the workspace. Valid values are `AMAZON_OPENSEARCH_SERVICE`, `ATHENA`, `CLOUDWATCH`, `PROMETHEUS`, `REDSHIFT`, `SITEWISE`, `TIMESTREAM`, `XRAY`
     * 
     */
    public Optional<Output<List<String>>> dataSources() {
        return Optional.ofNullable(this.dataSources);
    }

    /**
     * The workspace description.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return The workspace description.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Specifies the version of Grafana to support in the new workspace. Supported values are `8.4`, `9.4` and `10.4`. If not specified, defaults to `9.4`.
     * 
     */
    @Import(name="grafanaVersion")
    private @Nullable Output<String> grafanaVersion;

    /**
     * @return Specifies the version of Grafana to support in the new workspace. Supported values are `8.4`, `9.4` and `10.4`. If not specified, defaults to `9.4`.
     * 
     */
    public Optional<Output<String>> grafanaVersion() {
        return Optional.ofNullable(this.grafanaVersion);
    }

    /**
     * The Grafana workspace name.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The Grafana workspace name.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Configuration for network access to your workspace.See Network Access Control below.
     * 
     */
    @Import(name="networkAccessControl")
    private @Nullable Output<WorkspaceNetworkAccessControlArgs> networkAccessControl;

    /**
     * @return Configuration for network access to your workspace.See Network Access Control below.
     * 
     */
    public Optional<Output<WorkspaceNetworkAccessControlArgs>> networkAccessControl() {
        return Optional.ofNullable(this.networkAccessControl);
    }

    /**
     * The notification destinations. If a data source is specified here, Amazon Managed Grafana will create IAM roles and permissions needed to use these destinations. Must be set to `SNS`.
     * 
     */
    @Import(name="notificationDestinations")
    private @Nullable Output<List<String>> notificationDestinations;

    /**
     * @return The notification destinations. If a data source is specified here, Amazon Managed Grafana will create IAM roles and permissions needed to use these destinations. Must be set to `SNS`.
     * 
     */
    public Optional<Output<List<String>>> notificationDestinations() {
        return Optional.ofNullable(this.notificationDestinations);
    }

    /**
     * The role name that the workspace uses to access resources through Amazon Organizations.
     * 
     */
    @Import(name="organizationRoleName")
    private @Nullable Output<String> organizationRoleName;

    /**
     * @return The role name that the workspace uses to access resources through Amazon Organizations.
     * 
     */
    public Optional<Output<String>> organizationRoleName() {
        return Optional.ofNullable(this.organizationRoleName);
    }

    /**
     * The Amazon Organizations organizational units that the workspace is authorized to use data sources from.
     * 
     */
    @Import(name="organizationalUnits")
    private @Nullable Output<List<String>> organizationalUnits;

    /**
     * @return The Amazon Organizations organizational units that the workspace is authorized to use data sources from.
     * 
     */
    public Optional<Output<List<String>>> organizationalUnits() {
        return Optional.ofNullable(this.organizationalUnits);
    }

    /**
     * The permission type of the workspace. If `SERVICE_MANAGED` is specified, the IAM roles and IAM policy attachments are generated automatically. If `CUSTOMER_MANAGED` is specified, the IAM roles and IAM policy attachments will not be created.
     * 
     * The following arguments are optional:
     * 
     */
    @Import(name="permissionType", required=true)
    private Output<String> permissionType;

    /**
     * @return The permission type of the workspace. If `SERVICE_MANAGED` is specified, the IAM roles and IAM policy attachments are generated automatically. If `CUSTOMER_MANAGED` is specified, the IAM roles and IAM policy attachments will not be created.
     * 
     * The following arguments are optional:
     * 
     */
    public Output<String> permissionType() {
        return this.permissionType;
    }

    /**
     * The IAM role ARN that the workspace assumes.
     * 
     */
    @Import(name="roleArn")
    private @Nullable Output<String> roleArn;

    /**
     * @return The IAM role ARN that the workspace assumes.
     * 
     */
    public Optional<Output<String>> roleArn() {
        return Optional.ofNullable(this.roleArn);
    }

    /**
     * The AWS CloudFormation stack set name that provisions IAM roles to be used by the workspace.
     * 
     */
    @Import(name="stackSetName")
    private @Nullable Output<String> stackSetName;

    /**
     * @return The AWS CloudFormation stack set name that provisions IAM roles to be used by the workspace.
     * 
     */
    public Optional<Output<String>> stackSetName() {
        return Optional.ofNullable(this.stackSetName);
    }

    /**
     * Key-value mapping of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return Key-value mapping of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * The configuration settings for an Amazon VPC that contains data sources for your Grafana workspace to connect to. See VPC Configuration below.
     * 
     */
    @Import(name="vpcConfiguration")
    private @Nullable Output<WorkspaceVpcConfigurationArgs> vpcConfiguration;

    /**
     * @return The configuration settings for an Amazon VPC that contains data sources for your Grafana workspace to connect to. See VPC Configuration below.
     * 
     */
    public Optional<Output<WorkspaceVpcConfigurationArgs>> vpcConfiguration() {
        return Optional.ofNullable(this.vpcConfiguration);
    }

    private WorkspaceArgs() {}

    private WorkspaceArgs(WorkspaceArgs $) {
        this.accountAccessType = $.accountAccessType;
        this.authenticationProviders = $.authenticationProviders;
        this.configuration = $.configuration;
        this.dataSources = $.dataSources;
        this.description = $.description;
        this.grafanaVersion = $.grafanaVersion;
        this.name = $.name;
        this.networkAccessControl = $.networkAccessControl;
        this.notificationDestinations = $.notificationDestinations;
        this.organizationRoleName = $.organizationRoleName;
        this.organizationalUnits = $.organizationalUnits;
        this.permissionType = $.permissionType;
        this.roleArn = $.roleArn;
        this.stackSetName = $.stackSetName;
        this.tags = $.tags;
        this.vpcConfiguration = $.vpcConfiguration;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WorkspaceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WorkspaceArgs $;

        public Builder() {
            $ = new WorkspaceArgs();
        }

        public Builder(WorkspaceArgs defaults) {
            $ = new WorkspaceArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accountAccessType The type of account access for the workspace. Valid values are `CURRENT_ACCOUNT` and `ORGANIZATION`. If `ORGANIZATION` is specified, then `organizational_units` must also be present.
         * 
         * @return builder
         * 
         */
        public Builder accountAccessType(Output<String> accountAccessType) {
            $.accountAccessType = accountAccessType;
            return this;
        }

        /**
         * @param accountAccessType The type of account access for the workspace. Valid values are `CURRENT_ACCOUNT` and `ORGANIZATION`. If `ORGANIZATION` is specified, then `organizational_units` must also be present.
         * 
         * @return builder
         * 
         */
        public Builder accountAccessType(String accountAccessType) {
            return accountAccessType(Output.of(accountAccessType));
        }

        /**
         * @param authenticationProviders The authentication providers for the workspace. Valid values are `AWS_SSO`, `SAML`, or both.
         * 
         * @return builder
         * 
         */
        public Builder authenticationProviders(Output<List<String>> authenticationProviders) {
            $.authenticationProviders = authenticationProviders;
            return this;
        }

        /**
         * @param authenticationProviders The authentication providers for the workspace. Valid values are `AWS_SSO`, `SAML`, or both.
         * 
         * @return builder
         * 
         */
        public Builder authenticationProviders(List<String> authenticationProviders) {
            return authenticationProviders(Output.of(authenticationProviders));
        }

        /**
         * @param authenticationProviders The authentication providers for the workspace. Valid values are `AWS_SSO`, `SAML`, or both.
         * 
         * @return builder
         * 
         */
        public Builder authenticationProviders(String... authenticationProviders) {
            return authenticationProviders(List.of(authenticationProviders));
        }

        /**
         * @param configuration The configuration string for the workspace that you create. For more information about the format and configuration options available, see [Working in your Grafana workspace](https://docs.aws.amazon.com/grafana/latest/userguide/AMG-configure-workspace.html).
         * 
         * @return builder
         * 
         */
        public Builder configuration(@Nullable Output<String> configuration) {
            $.configuration = configuration;
            return this;
        }

        /**
         * @param configuration The configuration string for the workspace that you create. For more information about the format and configuration options available, see [Working in your Grafana workspace](https://docs.aws.amazon.com/grafana/latest/userguide/AMG-configure-workspace.html).
         * 
         * @return builder
         * 
         */
        public Builder configuration(String configuration) {
            return configuration(Output.of(configuration));
        }

        /**
         * @param dataSources The data sources for the workspace. Valid values are `AMAZON_OPENSEARCH_SERVICE`, `ATHENA`, `CLOUDWATCH`, `PROMETHEUS`, `REDSHIFT`, `SITEWISE`, `TIMESTREAM`, `XRAY`
         * 
         * @return builder
         * 
         */
        public Builder dataSources(@Nullable Output<List<String>> dataSources) {
            $.dataSources = dataSources;
            return this;
        }

        /**
         * @param dataSources The data sources for the workspace. Valid values are `AMAZON_OPENSEARCH_SERVICE`, `ATHENA`, `CLOUDWATCH`, `PROMETHEUS`, `REDSHIFT`, `SITEWISE`, `TIMESTREAM`, `XRAY`
         * 
         * @return builder
         * 
         */
        public Builder dataSources(List<String> dataSources) {
            return dataSources(Output.of(dataSources));
        }

        /**
         * @param dataSources The data sources for the workspace. Valid values are `AMAZON_OPENSEARCH_SERVICE`, `ATHENA`, `CLOUDWATCH`, `PROMETHEUS`, `REDSHIFT`, `SITEWISE`, `TIMESTREAM`, `XRAY`
         * 
         * @return builder
         * 
         */
        public Builder dataSources(String... dataSources) {
            return dataSources(List.of(dataSources));
        }

        /**
         * @param description The workspace description.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description The workspace description.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param grafanaVersion Specifies the version of Grafana to support in the new workspace. Supported values are `8.4`, `9.4` and `10.4`. If not specified, defaults to `9.4`.
         * 
         * @return builder
         * 
         */
        public Builder grafanaVersion(@Nullable Output<String> grafanaVersion) {
            $.grafanaVersion = grafanaVersion;
            return this;
        }

        /**
         * @param grafanaVersion Specifies the version of Grafana to support in the new workspace. Supported values are `8.4`, `9.4` and `10.4`. If not specified, defaults to `9.4`.
         * 
         * @return builder
         * 
         */
        public Builder grafanaVersion(String grafanaVersion) {
            return grafanaVersion(Output.of(grafanaVersion));
        }

        /**
         * @param name The Grafana workspace name.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The Grafana workspace name.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param networkAccessControl Configuration for network access to your workspace.See Network Access Control below.
         * 
         * @return builder
         * 
         */
        public Builder networkAccessControl(@Nullable Output<WorkspaceNetworkAccessControlArgs> networkAccessControl) {
            $.networkAccessControl = networkAccessControl;
            return this;
        }

        /**
         * @param networkAccessControl Configuration for network access to your workspace.See Network Access Control below.
         * 
         * @return builder
         * 
         */
        public Builder networkAccessControl(WorkspaceNetworkAccessControlArgs networkAccessControl) {
            return networkAccessControl(Output.of(networkAccessControl));
        }

        /**
         * @param notificationDestinations The notification destinations. If a data source is specified here, Amazon Managed Grafana will create IAM roles and permissions needed to use these destinations. Must be set to `SNS`.
         * 
         * @return builder
         * 
         */
        public Builder notificationDestinations(@Nullable Output<List<String>> notificationDestinations) {
            $.notificationDestinations = notificationDestinations;
            return this;
        }

        /**
         * @param notificationDestinations The notification destinations. If a data source is specified here, Amazon Managed Grafana will create IAM roles and permissions needed to use these destinations. Must be set to `SNS`.
         * 
         * @return builder
         * 
         */
        public Builder notificationDestinations(List<String> notificationDestinations) {
            return notificationDestinations(Output.of(notificationDestinations));
        }

        /**
         * @param notificationDestinations The notification destinations. If a data source is specified here, Amazon Managed Grafana will create IAM roles and permissions needed to use these destinations. Must be set to `SNS`.
         * 
         * @return builder
         * 
         */
        public Builder notificationDestinations(String... notificationDestinations) {
            return notificationDestinations(List.of(notificationDestinations));
        }

        /**
         * @param organizationRoleName The role name that the workspace uses to access resources through Amazon Organizations.
         * 
         * @return builder
         * 
         */
        public Builder organizationRoleName(@Nullable Output<String> organizationRoleName) {
            $.organizationRoleName = organizationRoleName;
            return this;
        }

        /**
         * @param organizationRoleName The role name that the workspace uses to access resources through Amazon Organizations.
         * 
         * @return builder
         * 
         */
        public Builder organizationRoleName(String organizationRoleName) {
            return organizationRoleName(Output.of(organizationRoleName));
        }

        /**
         * @param organizationalUnits The Amazon Organizations organizational units that the workspace is authorized to use data sources from.
         * 
         * @return builder
         * 
         */
        public Builder organizationalUnits(@Nullable Output<List<String>> organizationalUnits) {
            $.organizationalUnits = organizationalUnits;
            return this;
        }

        /**
         * @param organizationalUnits The Amazon Organizations organizational units that the workspace is authorized to use data sources from.
         * 
         * @return builder
         * 
         */
        public Builder organizationalUnits(List<String> organizationalUnits) {
            return organizationalUnits(Output.of(organizationalUnits));
        }

        /**
         * @param organizationalUnits The Amazon Organizations organizational units that the workspace is authorized to use data sources from.
         * 
         * @return builder
         * 
         */
        public Builder organizationalUnits(String... organizationalUnits) {
            return organizationalUnits(List.of(organizationalUnits));
        }

        /**
         * @param permissionType The permission type of the workspace. If `SERVICE_MANAGED` is specified, the IAM roles and IAM policy attachments are generated automatically. If `CUSTOMER_MANAGED` is specified, the IAM roles and IAM policy attachments will not be created.
         * 
         * The following arguments are optional:
         * 
         * @return builder
         * 
         */
        public Builder permissionType(Output<String> permissionType) {
            $.permissionType = permissionType;
            return this;
        }

        /**
         * @param permissionType The permission type of the workspace. If `SERVICE_MANAGED` is specified, the IAM roles and IAM policy attachments are generated automatically. If `CUSTOMER_MANAGED` is specified, the IAM roles and IAM policy attachments will not be created.
         * 
         * The following arguments are optional:
         * 
         * @return builder
         * 
         */
        public Builder permissionType(String permissionType) {
            return permissionType(Output.of(permissionType));
        }

        /**
         * @param roleArn The IAM role ARN that the workspace assumes.
         * 
         * @return builder
         * 
         */
        public Builder roleArn(@Nullable Output<String> roleArn) {
            $.roleArn = roleArn;
            return this;
        }

        /**
         * @param roleArn The IAM role ARN that the workspace assumes.
         * 
         * @return builder
         * 
         */
        public Builder roleArn(String roleArn) {
            return roleArn(Output.of(roleArn));
        }

        /**
         * @param stackSetName The AWS CloudFormation stack set name that provisions IAM roles to be used by the workspace.
         * 
         * @return builder
         * 
         */
        public Builder stackSetName(@Nullable Output<String> stackSetName) {
            $.stackSetName = stackSetName;
            return this;
        }

        /**
         * @param stackSetName The AWS CloudFormation stack set name that provisions IAM roles to be used by the workspace.
         * 
         * @return builder
         * 
         */
        public Builder stackSetName(String stackSetName) {
            return stackSetName(Output.of(stackSetName));
        }

        /**
         * @param tags Key-value mapping of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags Key-value mapping of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param vpcConfiguration The configuration settings for an Amazon VPC that contains data sources for your Grafana workspace to connect to. See VPC Configuration below.
         * 
         * @return builder
         * 
         */
        public Builder vpcConfiguration(@Nullable Output<WorkspaceVpcConfigurationArgs> vpcConfiguration) {
            $.vpcConfiguration = vpcConfiguration;
            return this;
        }

        /**
         * @param vpcConfiguration The configuration settings for an Amazon VPC that contains data sources for your Grafana workspace to connect to. See VPC Configuration below.
         * 
         * @return builder
         * 
         */
        public Builder vpcConfiguration(WorkspaceVpcConfigurationArgs vpcConfiguration) {
            return vpcConfiguration(Output.of(vpcConfiguration));
        }

        public WorkspaceArgs build() {
            if ($.accountAccessType == null) {
                throw new MissingRequiredPropertyException("WorkspaceArgs", "accountAccessType");
            }
            if ($.authenticationProviders == null) {
                throw new MissingRequiredPropertyException("WorkspaceArgs", "authenticationProviders");
            }
            if ($.permissionType == null) {
                throw new MissingRequiredPropertyException("WorkspaceArgs", "permissionType");
            }
            return $;
        }
    }

}
