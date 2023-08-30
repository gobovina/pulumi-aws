// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Manages a Kinesis Analytics v2 Application Snapshot.
 * Snapshots are the AWS implementation of [Flink Savepoints](https://ci.apache.org/projects/flink/flink-docs-release-1.11/ops/state/savepoints.html).
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const example = new aws.kinesisanalyticsv2.ApplicationSnapshot("example", {
 *     applicationName: aws_kinesisanalyticsv2_application.example.name,
 *     snapshotName: "example-snapshot",
 * });
 * ```
 *
 * ## Import
 *
 * Using `pulumi import`, import `aws_kinesisanalyticsv2_application` using `application_name` together with `snapshot_name`. For example:
 *
 * ```sh
 *  $ pulumi import aws:kinesisanalyticsv2/applicationSnapshot:ApplicationSnapshot example example-application/example-snapshot
 * ```
 */
export class ApplicationSnapshot extends pulumi.CustomResource {
    /**
     * Get an existing ApplicationSnapshot resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ApplicationSnapshotState, opts?: pulumi.CustomResourceOptions): ApplicationSnapshot {
        return new ApplicationSnapshot(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'aws:kinesisanalyticsv2/applicationSnapshot:ApplicationSnapshot';

    /**
     * Returns true if the given object is an instance of ApplicationSnapshot.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is ApplicationSnapshot {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === ApplicationSnapshot.__pulumiType;
    }

    /**
     * The name of an existing  Kinesis Analytics v2 Application. Note that the application must be running for a snapshot to be created.
     */
    public readonly applicationName!: pulumi.Output<string>;
    /**
     * The current application version ID when the snapshot was created.
     */
    public /*out*/ readonly applicationVersionId!: pulumi.Output<number>;
    /**
     * The timestamp of the application snapshot.
     */
    public /*out*/ readonly snapshotCreationTimestamp!: pulumi.Output<string>;
    /**
     * The name of the application snapshot.
     */
    public readonly snapshotName!: pulumi.Output<string>;

    /**
     * Create a ApplicationSnapshot resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: ApplicationSnapshotArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ApplicationSnapshotArgs | ApplicationSnapshotState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as ApplicationSnapshotState | undefined;
            resourceInputs["applicationName"] = state ? state.applicationName : undefined;
            resourceInputs["applicationVersionId"] = state ? state.applicationVersionId : undefined;
            resourceInputs["snapshotCreationTimestamp"] = state ? state.snapshotCreationTimestamp : undefined;
            resourceInputs["snapshotName"] = state ? state.snapshotName : undefined;
        } else {
            const args = argsOrState as ApplicationSnapshotArgs | undefined;
            if ((!args || args.applicationName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'applicationName'");
            }
            if ((!args || args.snapshotName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'snapshotName'");
            }
            resourceInputs["applicationName"] = args ? args.applicationName : undefined;
            resourceInputs["snapshotName"] = args ? args.snapshotName : undefined;
            resourceInputs["applicationVersionId"] = undefined /*out*/;
            resourceInputs["snapshotCreationTimestamp"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(ApplicationSnapshot.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering ApplicationSnapshot resources.
 */
export interface ApplicationSnapshotState {
    /**
     * The name of an existing  Kinesis Analytics v2 Application. Note that the application must be running for a snapshot to be created.
     */
    applicationName?: pulumi.Input<string>;
    /**
     * The current application version ID when the snapshot was created.
     */
    applicationVersionId?: pulumi.Input<number>;
    /**
     * The timestamp of the application snapshot.
     */
    snapshotCreationTimestamp?: pulumi.Input<string>;
    /**
     * The name of the application snapshot.
     */
    snapshotName?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a ApplicationSnapshot resource.
 */
export interface ApplicationSnapshotArgs {
    /**
     * The name of an existing  Kinesis Analytics v2 Application. Note that the application must be running for a snapshot to be created.
     */
    applicationName: pulumi.Input<string>;
    /**
     * The name of the application snapshot.
     */
    snapshotName: pulumi.Input<string>;
}
