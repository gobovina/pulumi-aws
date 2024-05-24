// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.guardduty;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.guardduty.OrganizationConfigurationArgs;
import com.pulumi.aws.guardduty.inputs.OrganizationConfigurationState;
import com.pulumi.aws.guardduty.outputs.OrganizationConfigurationDatasources;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Manages the GuardDuty Organization Configuration in the current AWS Region. The AWS account utilizing this resource must have been assigned as a delegated Organization administrator account, e.g., via the `aws.guardduty.OrganizationAdminAccount` resource. More information about Organizations support in GuardDuty can be found in the [GuardDuty User Guide](https://docs.aws.amazon.com/guardduty/latest/ug/guardduty_organizations.html).
 * 
 * &gt; **NOTE:** This is an advanced resource. The provider will automatically assume management of the GuardDuty Organization Configuration without import and perform no actions on removal from the resource configuration.
 * 
 * ## Example Usage
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.guardduty.Detector;
 * import com.pulumi.aws.guardduty.DetectorArgs;
 * import com.pulumi.aws.guardduty.OrganizationConfiguration;
 * import com.pulumi.aws.guardduty.OrganizationConfigurationArgs;
 * import com.pulumi.aws.guardduty.inputs.OrganizationConfigurationDatasourcesArgs;
 * import com.pulumi.aws.guardduty.inputs.OrganizationConfigurationDatasourcesS3LogsArgs;
 * import com.pulumi.aws.guardduty.inputs.OrganizationConfigurationDatasourcesKubernetesArgs;
 * import com.pulumi.aws.guardduty.inputs.OrganizationConfigurationDatasourcesKubernetesAuditLogsArgs;
 * import com.pulumi.aws.guardduty.inputs.OrganizationConfigurationDatasourcesMalwareProtectionArgs;
 * import com.pulumi.aws.guardduty.inputs.OrganizationConfigurationDatasourcesMalwareProtectionScanEc2InstanceWithFindingsArgs;
 * import com.pulumi.aws.guardduty.inputs.OrganizationConfigurationDatasourcesMalwareProtectionScanEc2InstanceWithFindingsEbsVolumesArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var example = new Detector("example", DetectorArgs.builder()
 *             .enable(true)
 *             .build());
 * 
 *         var exampleOrganizationConfiguration = new OrganizationConfiguration("exampleOrganizationConfiguration", OrganizationConfigurationArgs.builder()
 *             .autoEnableOrganizationMembers("ALL")
 *             .detectorId(example.id())
 *             .datasources(OrganizationConfigurationDatasourcesArgs.builder()
 *                 .s3Logs(OrganizationConfigurationDatasourcesS3LogsArgs.builder()
 *                     .autoEnable(true)
 *                     .build())
 *                 .kubernetes(OrganizationConfigurationDatasourcesKubernetesArgs.builder()
 *                     .auditLogs(OrganizationConfigurationDatasourcesKubernetesAuditLogsArgs.builder()
 *                         .enable(true)
 *                         .build())
 *                     .build())
 *                 .malwareProtection(OrganizationConfigurationDatasourcesMalwareProtectionArgs.builder()
 *                     .scanEc2InstanceWithFindings(OrganizationConfigurationDatasourcesMalwareProtectionScanEc2InstanceWithFindingsArgs.builder()
 *                         .ebsVolumes(OrganizationConfigurationDatasourcesMalwareProtectionScanEc2InstanceWithFindingsEbsVolumesArgs.builder()
 *                             .autoEnable(true)
 *                             .build())
 *                         .build())
 *                     .build())
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * Using `pulumi import`, import GuardDuty Organization Configurations using the GuardDuty Detector ID. For example:
 * 
 * ```sh
 * $ pulumi import aws:guardduty/organizationConfiguration:OrganizationConfiguration example 00b00fd5aecc0ab60a708659477e9617
 * ```
 * 
 */
@ResourceType(type="aws:guardduty/organizationConfiguration:OrganizationConfiguration")
public class OrganizationConfiguration extends com.pulumi.resources.CustomResource {
    /**
     * *Deprecated:* Use `auto_enable_organization_members` instead. When this setting is enabled, all new accounts that are created in, or added to, the organization are added as a member accounts of the organization’s GuardDuty delegated administrator and GuardDuty is enabled in that AWS Region.
     * 
     * @deprecated
     * Use auto_enable_organization_members instead
     * 
     */
    @Deprecated /* Use auto_enable_organization_members instead */
    @Export(name="autoEnable", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> autoEnable;

    /**
     * @return *Deprecated:* Use `auto_enable_organization_members` instead. When this setting is enabled, all new accounts that are created in, or added to, the organization are added as a member accounts of the organization’s GuardDuty delegated administrator and GuardDuty is enabled in that AWS Region.
     * 
     */
    public Output<Boolean> autoEnable() {
        return this.autoEnable;
    }
    /**
     * Indicates the auto-enablement configuration of GuardDuty for the member accounts in the organization. Valid values are `ALL`, `NEW`, `NONE`.
     * 
     */
    @Export(name="autoEnableOrganizationMembers", refs={String.class}, tree="[0]")
    private Output<String> autoEnableOrganizationMembers;

    /**
     * @return Indicates the auto-enablement configuration of GuardDuty for the member accounts in the organization. Valid values are `ALL`, `NEW`, `NONE`.
     * 
     */
    public Output<String> autoEnableOrganizationMembers() {
        return this.autoEnableOrganizationMembers;
    }
    /**
     * Configuration for the collected datasources.
     * 
     */
    @Export(name="datasources", refs={OrganizationConfigurationDatasources.class}, tree="[0]")
    private Output<OrganizationConfigurationDatasources> datasources;

    /**
     * @return Configuration for the collected datasources.
     * 
     */
    public Output<OrganizationConfigurationDatasources> datasources() {
        return this.datasources;
    }
    /**
     * The detector ID of the GuardDuty account.
     * 
     */
    @Export(name="detectorId", refs={String.class}, tree="[0]")
    private Output<String> detectorId;

    /**
     * @return The detector ID of the GuardDuty account.
     * 
     */
    public Output<String> detectorId() {
        return this.detectorId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public OrganizationConfiguration(String name) {
        this(name, OrganizationConfigurationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public OrganizationConfiguration(String name, OrganizationConfigurationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public OrganizationConfiguration(String name, OrganizationConfigurationArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:guardduty/organizationConfiguration:OrganizationConfiguration", name, args == null ? OrganizationConfigurationArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private OrganizationConfiguration(String name, Output<String> id, @Nullable OrganizationConfigurationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:guardduty/organizationConfiguration:OrganizationConfiguration", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static OrganizationConfiguration get(String name, Output<String> id, @Nullable OrganizationConfigurationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new OrganizationConfiguration(name, id, state, options);
    }
}
