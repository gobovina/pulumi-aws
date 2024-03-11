// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Provides an AWS Backup vault notifications resource.
 *
 * ## Example Usage
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const testTopic = new aws.sns.Topic("test", {name: "backup-vault-events"});
 * const test = testTopic.arn.apply(arn => aws.iam.getPolicyDocumentOutput({
 *     policyId: "__default_policy_ID",
 *     statements: [{
 *         actions: ["SNS:Publish"],
 *         effect: "Allow",
 *         principals: [{
 *             type: "Service",
 *             identifiers: ["backup.amazonaws.com"],
 *         }],
 *         resources: [arn],
 *         sid: "__default_statement_ID",
 *     }],
 * }));
 * const testTopicPolicy = new aws.sns.TopicPolicy("test", {
 *     arn: testTopic.arn,
 *     policy: test.apply(test => test.json),
 * });
 * const testVaultNotifications = new aws.backup.VaultNotifications("test", {
 *     backupVaultName: "example_backup_vault",
 *     snsTopicArn: testTopic.arn,
 *     backupVaultEvents: [
 *         "BACKUP_JOB_STARTED",
 *         "RESTORE_JOB_COMPLETED",
 *     ],
 * });
 * ```
 * <!--End PulumiCodeChooser -->
 *
 * ## Import
 *
 * Using `pulumi import`, import Backup vault notifications using the `name`. For example:
 *
 * ```sh
 * $ pulumi import aws:backup/vaultNotifications:VaultNotifications test TestVault
 * ```
 */
export class VaultNotifications extends pulumi.CustomResource {
    /**
     * Get an existing VaultNotifications resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: VaultNotificationsState, opts?: pulumi.CustomResourceOptions): VaultNotifications {
        return new VaultNotifications(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'aws:backup/vaultNotifications:VaultNotifications';

    /**
     * Returns true if the given object is an instance of VaultNotifications.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is VaultNotifications {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === VaultNotifications.__pulumiType;
    }

    /**
     * The ARN of the vault.
     */
    public /*out*/ readonly backupVaultArn!: pulumi.Output<string>;
    /**
     * An array of events that indicate the status of jobs to back up resources to the backup vault.
     */
    public readonly backupVaultEvents!: pulumi.Output<string[]>;
    /**
     * Name of the backup vault to add notifications for.
     */
    public readonly backupVaultName!: pulumi.Output<string>;
    /**
     * The Amazon Resource Name (ARN) that specifies the topic for a backup vault’s events
     */
    public readonly snsTopicArn!: pulumi.Output<string>;

    /**
     * Create a VaultNotifications resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: VaultNotificationsArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: VaultNotificationsArgs | VaultNotificationsState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as VaultNotificationsState | undefined;
            resourceInputs["backupVaultArn"] = state ? state.backupVaultArn : undefined;
            resourceInputs["backupVaultEvents"] = state ? state.backupVaultEvents : undefined;
            resourceInputs["backupVaultName"] = state ? state.backupVaultName : undefined;
            resourceInputs["snsTopicArn"] = state ? state.snsTopicArn : undefined;
        } else {
            const args = argsOrState as VaultNotificationsArgs | undefined;
            if ((!args || args.backupVaultEvents === undefined) && !opts.urn) {
                throw new Error("Missing required property 'backupVaultEvents'");
            }
            if ((!args || args.backupVaultName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'backupVaultName'");
            }
            if ((!args || args.snsTopicArn === undefined) && !opts.urn) {
                throw new Error("Missing required property 'snsTopicArn'");
            }
            resourceInputs["backupVaultEvents"] = args ? args.backupVaultEvents : undefined;
            resourceInputs["backupVaultName"] = args ? args.backupVaultName : undefined;
            resourceInputs["snsTopicArn"] = args ? args.snsTopicArn : undefined;
            resourceInputs["backupVaultArn"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(VaultNotifications.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering VaultNotifications resources.
 */
export interface VaultNotificationsState {
    /**
     * The ARN of the vault.
     */
    backupVaultArn?: pulumi.Input<string>;
    /**
     * An array of events that indicate the status of jobs to back up resources to the backup vault.
     */
    backupVaultEvents?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Name of the backup vault to add notifications for.
     */
    backupVaultName?: pulumi.Input<string>;
    /**
     * The Amazon Resource Name (ARN) that specifies the topic for a backup vault’s events
     */
    snsTopicArn?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a VaultNotifications resource.
 */
export interface VaultNotificationsArgs {
    /**
     * An array of events that indicate the status of jobs to back up resources to the backup vault.
     */
    backupVaultEvents: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Name of the backup vault to add notifications for.
     */
    backupVaultName: pulumi.Input<string>;
    /**
     * The Amazon Resource Name (ARN) that specifies the topic for a backup vault’s events
     */
    snsTopicArn: pulumi.Input<string>;
}
