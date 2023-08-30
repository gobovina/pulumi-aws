// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as enums from "../types/enums";
import * as utilities from "../utilities";

/**
 * Provides an SSM Patch Baseline resource.
 *
 * > **NOTE on Patch Baselines:** The `approvedPatches` and `approvalRule` are
 * both marked as optional fields, but the Patch Baseline requires that at least one
 * of them is specified.
 *
 * ## Example Usage
 * ### Basic Usage
 *
 * Using `approvedPatches` only.
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const production = new aws.ssm.PatchBaseline("production", {approvedPatches: ["KB123456"]});
 * ```
 * ### Advanced Usage, specifying patch filters
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const production = new aws.ssm.PatchBaseline("production", {
 *     approvalRules: [
 *         {
 *             approveAfterDays: 7,
 *             complianceLevel: "HIGH",
 *             patchFilters: [
 *                 {
 *                     key: "PRODUCT",
 *                     values: ["WindowsServer2016"],
 *                 },
 *                 {
 *                     key: "CLASSIFICATION",
 *                     values: [
 *                         "CriticalUpdates",
 *                         "SecurityUpdates",
 *                         "Updates",
 *                     ],
 *                 },
 *                 {
 *                     key: "MSRC_SEVERITY",
 *                     values: [
 *                         "Critical",
 *                         "Important",
 *                         "Moderate",
 *                     ],
 *                 },
 *             ],
 *         },
 *         {
 *             approveAfterDays: 7,
 *             patchFilters: [{
 *                 key: "PRODUCT",
 *                 values: ["WindowsServer2012"],
 *             }],
 *         },
 *     ],
 *     approvedPatches: [
 *         "KB123456",
 *         "KB456789",
 *     ],
 *     description: "Patch Baseline Description",
 *     globalFilters: [
 *         {
 *             key: "PRODUCT",
 *             values: ["WindowsServer2008"],
 *         },
 *         {
 *             key: "CLASSIFICATION",
 *             values: ["ServicePacks"],
 *         },
 *         {
 *             key: "MSRC_SEVERITY",
 *             values: ["Low"],
 *         },
 *     ],
 *     rejectedPatches: ["KB987654"],
 * });
 * ```
 * ### Advanced usage, specifying Microsoft application and Windows patch rules
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const windowsOsApps = new aws.ssm.PatchBaseline("windowsOsApps", {
 *     approvalRules: [
 *         {
 *             approveAfterDays: 7,
 *             patchFilters: [
 *                 {
 *                     key: "CLASSIFICATION",
 *                     values: [
 *                         "CriticalUpdates",
 *                         "SecurityUpdates",
 *                     ],
 *                 },
 *                 {
 *                     key: "MSRC_SEVERITY",
 *                     values: [
 *                         "Critical",
 *                         "Important",
 *                     ],
 *                 },
 *             ],
 *         },
 *         {
 *             approveAfterDays: 7,
 *             patchFilters: [
 *                 {
 *                     key: "PATCH_SET",
 *                     values: ["APPLICATION"],
 *                 },
 *                 {
 *                     key: "PRODUCT",
 *                     values: [
 *                         "Office 2013",
 *                         "Office 2016",
 *                     ],
 *                 },
 *             ],
 *         },
 *     ],
 *     description: "Patch both Windows and Microsoft apps",
 *     operatingSystem: "WINDOWS",
 * });
 * ```
 * ### Advanced usage, specifying alternate patch source repository
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const al201709 = new aws.ssm.PatchBaseline("al201709", {
 *     approvalRules: [{}],
 *     description: "My patch repository for Amazon Linux 2017.09",
 *     operatingSystem: "AMAZON_LINUX",
 *     sources: [{
 *         configuration: `[amzn-main]
 * name=amzn-main-Base
 * mirrorlist=http://repo./$awsregion./$awsdomain//$releasever/main/mirror.list
 * mirrorlist_expire=300
 * metadata_expire=300
 * priority=10
 * failovermethod=priority
 * fastestmirror_enabled=0
 * gpgcheck=1
 * gpgkey=file:///etc/pki/rpm-gpg/RPM-GPG-KEY-amazon-ga
 * enabled=1
 * retries=3
 * timeout=5
 * report_instanceid=yes
 *
 * `,
 *         name: "My-AL2017.09",
 *         products: ["AmazonLinux2017.09"],
 *     }],
 * });
 * ```
 *
 * ## Import
 *
 * Using `pulumi import`, import SSM Patch Baselines using their baseline ID. For example:
 *
 * ```sh
 *  $ pulumi import aws:ssm/patchBaseline:PatchBaseline example pb-12345678
 * ```
 */
export class PatchBaseline extends pulumi.CustomResource {
    /**
     * Get an existing PatchBaseline resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: PatchBaselineState, opts?: pulumi.CustomResourceOptions): PatchBaseline {
        return new PatchBaseline(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'aws:ssm/patchBaseline:PatchBaseline';

    /**
     * Returns true if the given object is an instance of PatchBaseline.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is PatchBaseline {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === PatchBaseline.__pulumiType;
    }

    /**
     * A set of rules used to include patches in the baseline.
     * Up to 10 approval rules can be specified.
     * See `approvalRule` below.
     */
    public readonly approvalRules!: pulumi.Output<outputs.ssm.PatchBaselineApprovalRule[] | undefined>;
    /**
     * A list of explicitly approved patches for the baseline.
     * Cannot be specified with `approvalRule`.
     */
    public readonly approvedPatches!: pulumi.Output<string[] | undefined>;
    /**
     * The compliance level for approved patches.
     * This means that if an approved patch is reported as missing, this is the severity of the compliance violation.
     * Valid values are `CRITICAL`, `HIGH`, `MEDIUM`, `LOW`, `INFORMATIONAL`, `UNSPECIFIED`.
     * The default value is `UNSPECIFIED`.
     */
    public readonly approvedPatchesComplianceLevel!: pulumi.Output<string | undefined>;
    /**
     * Indicates whether the list of approved patches includes non-security updates that should be applied to the instances.
     * Applies to Linux instances only.
     */
    public readonly approvedPatchesEnableNonSecurity!: pulumi.Output<boolean | undefined>;
    /**
     * The ARN of the patch baseline.
     */
    public /*out*/ readonly arn!: pulumi.Output<string>;
    /**
     * The description of the patch baseline.
     */
    public readonly description!: pulumi.Output<string | undefined>;
    /**
     * A set of global filters used to exclude patches from the baseline.
     * Up to 4 global filters can be specified using Key/Value pairs.
     * Valid Keys are `PRODUCT`, `CLASSIFICATION`, `MSRC_SEVERITY`, and `PATCH_ID`.
     */
    public readonly globalFilters!: pulumi.Output<outputs.ssm.PatchBaselineGlobalFilter[] | undefined>;
    /**
     * The name of the patch baseline.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * The operating system the patch baseline applies to.
     * Valid values are
     * `ALMA_LINUX`,
     * `AMAZON_LINUX`,
     * `AMAZON_LINUX_2`,
     * `AMAZON_LINUX_2022`,
     * `AMAZON_LINUX_2023`,
     * `CENTOS`,
     * `DEBIAN`,
     * `MACOS`,
     * `ORACLE_LINUX`,
     * `RASPBIAN`,
     * `REDHAT_ENTERPRISE_LINUX`,
     * `ROCKY_LINUX`,
     * `SUSE`,
     * `UBUNTU`, and
     * `WINDOWS`.
     * The default value is `WINDOWS`.
     */
    public readonly operatingSystem!: pulumi.Output<string | undefined>;
    /**
     * A list of rejected patches.
     */
    public readonly rejectedPatches!: pulumi.Output<string[] | undefined>;
    /**
     * The action for Patch Manager to take on patches included in the `rejectedPatches` list.
     * Valid values are `ALLOW_AS_DEPENDENCY` and `BLOCK`.
     */
    public readonly rejectedPatchesAction!: pulumi.Output<string>;
    /**
     * Configuration block with alternate sources for patches.
     * Applies to Linux instances only.
     * See `source` below.
     */
    public readonly sources!: pulumi.Output<outputs.ssm.PatchBaselineSource[] | undefined>;
    /**
     * A map of tags to assign to the resource. .If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    public readonly tags!: pulumi.Output<{[key: string]: string} | undefined>;
    /**
     * A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
     */
    public /*out*/ readonly tagsAll!: pulumi.Output<{[key: string]: string}>;

    /**
     * Create a PatchBaseline resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args?: PatchBaselineArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: PatchBaselineArgs | PatchBaselineState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as PatchBaselineState | undefined;
            resourceInputs["approvalRules"] = state ? state.approvalRules : undefined;
            resourceInputs["approvedPatches"] = state ? state.approvedPatches : undefined;
            resourceInputs["approvedPatchesComplianceLevel"] = state ? state.approvedPatchesComplianceLevel : undefined;
            resourceInputs["approvedPatchesEnableNonSecurity"] = state ? state.approvedPatchesEnableNonSecurity : undefined;
            resourceInputs["arn"] = state ? state.arn : undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["globalFilters"] = state ? state.globalFilters : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["operatingSystem"] = state ? state.operatingSystem : undefined;
            resourceInputs["rejectedPatches"] = state ? state.rejectedPatches : undefined;
            resourceInputs["rejectedPatchesAction"] = state ? state.rejectedPatchesAction : undefined;
            resourceInputs["sources"] = state ? state.sources : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
            resourceInputs["tagsAll"] = state ? state.tagsAll : undefined;
        } else {
            const args = argsOrState as PatchBaselineArgs | undefined;
            resourceInputs["approvalRules"] = args ? args.approvalRules : undefined;
            resourceInputs["approvedPatches"] = args ? args.approvedPatches : undefined;
            resourceInputs["approvedPatchesComplianceLevel"] = args ? args.approvedPatchesComplianceLevel : undefined;
            resourceInputs["approvedPatchesEnableNonSecurity"] = args ? args.approvedPatchesEnableNonSecurity : undefined;
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["globalFilters"] = args ? args.globalFilters : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["operatingSystem"] = args ? args.operatingSystem : undefined;
            resourceInputs["rejectedPatches"] = args ? args.rejectedPatches : undefined;
            resourceInputs["rejectedPatchesAction"] = args ? args.rejectedPatchesAction : undefined;
            resourceInputs["sources"] = args ? args.sources : undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
            resourceInputs["arn"] = undefined /*out*/;
            resourceInputs["tagsAll"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(PatchBaseline.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering PatchBaseline resources.
 */
export interface PatchBaselineState {
    /**
     * A set of rules used to include patches in the baseline.
     * Up to 10 approval rules can be specified.
     * See `approvalRule` below.
     */
    approvalRules?: pulumi.Input<pulumi.Input<inputs.ssm.PatchBaselineApprovalRule>[]>;
    /**
     * A list of explicitly approved patches for the baseline.
     * Cannot be specified with `approvalRule`.
     */
    approvedPatches?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The compliance level for approved patches.
     * This means that if an approved patch is reported as missing, this is the severity of the compliance violation.
     * Valid values are `CRITICAL`, `HIGH`, `MEDIUM`, `LOW`, `INFORMATIONAL`, `UNSPECIFIED`.
     * The default value is `UNSPECIFIED`.
     */
    approvedPatchesComplianceLevel?: pulumi.Input<string>;
    /**
     * Indicates whether the list of approved patches includes non-security updates that should be applied to the instances.
     * Applies to Linux instances only.
     */
    approvedPatchesEnableNonSecurity?: pulumi.Input<boolean>;
    /**
     * The ARN of the patch baseline.
     */
    arn?: pulumi.Input<string>;
    /**
     * The description of the patch baseline.
     */
    description?: pulumi.Input<string>;
    /**
     * A set of global filters used to exclude patches from the baseline.
     * Up to 4 global filters can be specified using Key/Value pairs.
     * Valid Keys are `PRODUCT`, `CLASSIFICATION`, `MSRC_SEVERITY`, and `PATCH_ID`.
     */
    globalFilters?: pulumi.Input<pulumi.Input<inputs.ssm.PatchBaselineGlobalFilter>[]>;
    /**
     * The name of the patch baseline.
     */
    name?: pulumi.Input<string>;
    /**
     * The operating system the patch baseline applies to.
     * Valid values are
     * `ALMA_LINUX`,
     * `AMAZON_LINUX`,
     * `AMAZON_LINUX_2`,
     * `AMAZON_LINUX_2022`,
     * `AMAZON_LINUX_2023`,
     * `CENTOS`,
     * `DEBIAN`,
     * `MACOS`,
     * `ORACLE_LINUX`,
     * `RASPBIAN`,
     * `REDHAT_ENTERPRISE_LINUX`,
     * `ROCKY_LINUX`,
     * `SUSE`,
     * `UBUNTU`, and
     * `WINDOWS`.
     * The default value is `WINDOWS`.
     */
    operatingSystem?: pulumi.Input<string>;
    /**
     * A list of rejected patches.
     */
    rejectedPatches?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The action for Patch Manager to take on patches included in the `rejectedPatches` list.
     * Valid values are `ALLOW_AS_DEPENDENCY` and `BLOCK`.
     */
    rejectedPatchesAction?: pulumi.Input<string>;
    /**
     * Configuration block with alternate sources for patches.
     * Applies to Linux instances only.
     * See `source` below.
     */
    sources?: pulumi.Input<pulumi.Input<inputs.ssm.PatchBaselineSource>[]>;
    /**
     * A map of tags to assign to the resource. .If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
     */
    tagsAll?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
}

/**
 * The set of arguments for constructing a PatchBaseline resource.
 */
export interface PatchBaselineArgs {
    /**
     * A set of rules used to include patches in the baseline.
     * Up to 10 approval rules can be specified.
     * See `approvalRule` below.
     */
    approvalRules?: pulumi.Input<pulumi.Input<inputs.ssm.PatchBaselineApprovalRule>[]>;
    /**
     * A list of explicitly approved patches for the baseline.
     * Cannot be specified with `approvalRule`.
     */
    approvedPatches?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The compliance level for approved patches.
     * This means that if an approved patch is reported as missing, this is the severity of the compliance violation.
     * Valid values are `CRITICAL`, `HIGH`, `MEDIUM`, `LOW`, `INFORMATIONAL`, `UNSPECIFIED`.
     * The default value is `UNSPECIFIED`.
     */
    approvedPatchesComplianceLevel?: pulumi.Input<string>;
    /**
     * Indicates whether the list of approved patches includes non-security updates that should be applied to the instances.
     * Applies to Linux instances only.
     */
    approvedPatchesEnableNonSecurity?: pulumi.Input<boolean>;
    /**
     * The description of the patch baseline.
     */
    description?: pulumi.Input<string>;
    /**
     * A set of global filters used to exclude patches from the baseline.
     * Up to 4 global filters can be specified using Key/Value pairs.
     * Valid Keys are `PRODUCT`, `CLASSIFICATION`, `MSRC_SEVERITY`, and `PATCH_ID`.
     */
    globalFilters?: pulumi.Input<pulumi.Input<inputs.ssm.PatchBaselineGlobalFilter>[]>;
    /**
     * The name of the patch baseline.
     */
    name?: pulumi.Input<string>;
    /**
     * The operating system the patch baseline applies to.
     * Valid values are
     * `ALMA_LINUX`,
     * `AMAZON_LINUX`,
     * `AMAZON_LINUX_2`,
     * `AMAZON_LINUX_2022`,
     * `AMAZON_LINUX_2023`,
     * `CENTOS`,
     * `DEBIAN`,
     * `MACOS`,
     * `ORACLE_LINUX`,
     * `RASPBIAN`,
     * `REDHAT_ENTERPRISE_LINUX`,
     * `ROCKY_LINUX`,
     * `SUSE`,
     * `UBUNTU`, and
     * `WINDOWS`.
     * The default value is `WINDOWS`.
     */
    operatingSystem?: pulumi.Input<string>;
    /**
     * A list of rejected patches.
     */
    rejectedPatches?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The action for Patch Manager to take on patches included in the `rejectedPatches` list.
     * Valid values are `ALLOW_AS_DEPENDENCY` and `BLOCK`.
     */
    rejectedPatchesAction?: pulumi.Input<string>;
    /**
     * Configuration block with alternate sources for patches.
     * Applies to Linux instances only.
     * See `source` below.
     */
    sources?: pulumi.Input<pulumi.Input<inputs.ssm.PatchBaselineSource>[]>;
    /**
     * A map of tags to assign to the resource. .If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
}
