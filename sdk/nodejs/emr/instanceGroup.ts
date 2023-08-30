// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as enums from "../types/enums";
import * as utilities from "../utilities";

/**
 * Provides an Elastic MapReduce Cluster Instance Group configuration.
 * See [Amazon Elastic MapReduce Documentation](https://aws.amazon.com/documentation/emr/) for more information.
 *
 * > **NOTE:** At this time, Instance Groups cannot be destroyed through the API nor
 * web interface. Instance Groups are destroyed when the EMR Cluster is destroyed.
 * this provider will resize any Instance Group to zero when destroying the resource.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const task = new aws.emr.InstanceGroup("task", {
 *     clusterId: aws_emr_cluster["tf-test-cluster"].id,
 *     instanceCount: 1,
 *     instanceType: "m5.xlarge",
 * });
 * ```
 *
 * ## Import
 *
 * Using `pulumi import`, import EMR task instance group using their EMR Cluster id and Instance Group id separated by a forward-slash `/`. For example:
 *
 * ```sh
 *  $ pulumi import aws:emr/instanceGroup:InstanceGroup task_group j-123456ABCDEF/ig-15EK4O09RZLNR
 * ```
 */
export class InstanceGroup extends pulumi.CustomResource {
    /**
     * Get an existing InstanceGroup resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: InstanceGroupState, opts?: pulumi.CustomResourceOptions): InstanceGroup {
        return new InstanceGroup(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'aws:emr/instanceGroup:InstanceGroup';

    /**
     * Returns true if the given object is an instance of InstanceGroup.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is InstanceGroup {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === InstanceGroup.__pulumiType;
    }

    /**
     * The autoscaling policy document. This is a JSON formatted string. See [EMR Auto Scaling](https://docs.aws.amazon.com/emr/latest/ManagementGuide/emr-automatic-scaling.html)
     */
    public readonly autoscalingPolicy!: pulumi.Output<string | undefined>;
    /**
     * If set, the bid price for each EC2 instance in the instance group, expressed in USD. By setting this attribute, the instance group is being declared as a Spot Instance, and will implicitly create a Spot request. Leave this blank to use On-Demand Instances.
     */
    public readonly bidPrice!: pulumi.Output<string | undefined>;
    /**
     * ID of the EMR Cluster to attach to. Changing this forces a new resource to be created.
     */
    public readonly clusterId!: pulumi.Output<string>;
    /**
     * A JSON string for supplying list of configurations specific to the EMR instance group. Note that this can only be changed when using EMR release 5.21 or later.
     *
     * ```typescript
     * import * as pulumi from "@pulumi/pulumi";
     * import * as aws from "@pulumi/aws";
     *
     * const task = new aws.emr.InstanceGroup("task", {configurationsJson: `[
     * {
     * "Classification": "hadoop-env",
     * "Configurations": [
     * {
     * "Classification": "export",
     * "Properties": {
     * "JAVA_HOME": "/usr/lib/jvm/java-1.8.0"
     * }
     * }
     * ],
     * "Properties": {}
     * }
     * ]
     *
     * `});
     * ```
     */
    public readonly configurationsJson!: pulumi.Output<string | undefined>;
    /**
     * One or more `ebsConfig` blocks as defined below. Changing this forces a new resource to be created.
     */
    public readonly ebsConfigs!: pulumi.Output<outputs.emr.InstanceGroupEbsConfig[]>;
    /**
     * Indicates whether an Amazon EBS volume is EBS-optimized. Changing this forces a new resource to be created.
     */
    public readonly ebsOptimized!: pulumi.Output<boolean | undefined>;
    /**
     * target number of instances for the instance group. defaults to 0.
     */
    public readonly instanceCount!: pulumi.Output<number>;
    /**
     * The EC2 instance type for all instances in the instance group. Changing this forces a new resource to be created.
     */
    public readonly instanceType!: pulumi.Output<string>;
    /**
     * Human friendly name given to the instance group. Changing this forces a new resource to be created.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * The number of instances currently running in this instance group.
     */
    public /*out*/ readonly runningInstanceCount!: pulumi.Output<number>;
    /**
     * The current status of the instance group.
     */
    public /*out*/ readonly status!: pulumi.Output<string>;

    /**
     * Create a InstanceGroup resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: InstanceGroupArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: InstanceGroupArgs | InstanceGroupState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as InstanceGroupState | undefined;
            resourceInputs["autoscalingPolicy"] = state ? state.autoscalingPolicy : undefined;
            resourceInputs["bidPrice"] = state ? state.bidPrice : undefined;
            resourceInputs["clusterId"] = state ? state.clusterId : undefined;
            resourceInputs["configurationsJson"] = state ? state.configurationsJson : undefined;
            resourceInputs["ebsConfigs"] = state ? state.ebsConfigs : undefined;
            resourceInputs["ebsOptimized"] = state ? state.ebsOptimized : undefined;
            resourceInputs["instanceCount"] = state ? state.instanceCount : undefined;
            resourceInputs["instanceType"] = state ? state.instanceType : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["runningInstanceCount"] = state ? state.runningInstanceCount : undefined;
            resourceInputs["status"] = state ? state.status : undefined;
        } else {
            const args = argsOrState as InstanceGroupArgs | undefined;
            if ((!args || args.clusterId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'clusterId'");
            }
            if ((!args || args.instanceType === undefined) && !opts.urn) {
                throw new Error("Missing required property 'instanceType'");
            }
            resourceInputs["autoscalingPolicy"] = args ? args.autoscalingPolicy : undefined;
            resourceInputs["bidPrice"] = args ? args.bidPrice : undefined;
            resourceInputs["clusterId"] = args ? args.clusterId : undefined;
            resourceInputs["configurationsJson"] = args ? args.configurationsJson : undefined;
            resourceInputs["ebsConfigs"] = args ? args.ebsConfigs : undefined;
            resourceInputs["ebsOptimized"] = args ? args.ebsOptimized : undefined;
            resourceInputs["instanceCount"] = args ? args.instanceCount : undefined;
            resourceInputs["instanceType"] = args ? args.instanceType : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["runningInstanceCount"] = undefined /*out*/;
            resourceInputs["status"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(InstanceGroup.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering InstanceGroup resources.
 */
export interface InstanceGroupState {
    /**
     * The autoscaling policy document. This is a JSON formatted string. See [EMR Auto Scaling](https://docs.aws.amazon.com/emr/latest/ManagementGuide/emr-automatic-scaling.html)
     */
    autoscalingPolicy?: pulumi.Input<string>;
    /**
     * If set, the bid price for each EC2 instance in the instance group, expressed in USD. By setting this attribute, the instance group is being declared as a Spot Instance, and will implicitly create a Spot request. Leave this blank to use On-Demand Instances.
     */
    bidPrice?: pulumi.Input<string>;
    /**
     * ID of the EMR Cluster to attach to. Changing this forces a new resource to be created.
     */
    clusterId?: pulumi.Input<string>;
    /**
     * A JSON string for supplying list of configurations specific to the EMR instance group. Note that this can only be changed when using EMR release 5.21 or later.
     *
     * ```typescript
     * import * as pulumi from "@pulumi/pulumi";
     * import * as aws from "@pulumi/aws";
     *
     * const task = new aws.emr.InstanceGroup("task", {configurationsJson: `[
     * {
     * "Classification": "hadoop-env",
     * "Configurations": [
     * {
     * "Classification": "export",
     * "Properties": {
     * "JAVA_HOME": "/usr/lib/jvm/java-1.8.0"
     * }
     * }
     * ],
     * "Properties": {}
     * }
     * ]
     *
     * `});
     * ```
     */
    configurationsJson?: pulumi.Input<string>;
    /**
     * One or more `ebsConfig` blocks as defined below. Changing this forces a new resource to be created.
     */
    ebsConfigs?: pulumi.Input<pulumi.Input<inputs.emr.InstanceGroupEbsConfig>[]>;
    /**
     * Indicates whether an Amazon EBS volume is EBS-optimized. Changing this forces a new resource to be created.
     */
    ebsOptimized?: pulumi.Input<boolean>;
    /**
     * target number of instances for the instance group. defaults to 0.
     */
    instanceCount?: pulumi.Input<number>;
    /**
     * The EC2 instance type for all instances in the instance group. Changing this forces a new resource to be created.
     */
    instanceType?: pulumi.Input<string>;
    /**
     * Human friendly name given to the instance group. Changing this forces a new resource to be created.
     */
    name?: pulumi.Input<string>;
    /**
     * The number of instances currently running in this instance group.
     */
    runningInstanceCount?: pulumi.Input<number>;
    /**
     * The current status of the instance group.
     */
    status?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a InstanceGroup resource.
 */
export interface InstanceGroupArgs {
    /**
     * The autoscaling policy document. This is a JSON formatted string. See [EMR Auto Scaling](https://docs.aws.amazon.com/emr/latest/ManagementGuide/emr-automatic-scaling.html)
     */
    autoscalingPolicy?: pulumi.Input<string>;
    /**
     * If set, the bid price for each EC2 instance in the instance group, expressed in USD. By setting this attribute, the instance group is being declared as a Spot Instance, and will implicitly create a Spot request. Leave this blank to use On-Demand Instances.
     */
    bidPrice?: pulumi.Input<string>;
    /**
     * ID of the EMR Cluster to attach to. Changing this forces a new resource to be created.
     */
    clusterId: pulumi.Input<string>;
    /**
     * A JSON string for supplying list of configurations specific to the EMR instance group. Note that this can only be changed when using EMR release 5.21 or later.
     *
     * ```typescript
     * import * as pulumi from "@pulumi/pulumi";
     * import * as aws from "@pulumi/aws";
     *
     * const task = new aws.emr.InstanceGroup("task", {configurationsJson: `[
     * {
     * "Classification": "hadoop-env",
     * "Configurations": [
     * {
     * "Classification": "export",
     * "Properties": {
     * "JAVA_HOME": "/usr/lib/jvm/java-1.8.0"
     * }
     * }
     * ],
     * "Properties": {}
     * }
     * ]
     *
     * `});
     * ```
     */
    configurationsJson?: pulumi.Input<string>;
    /**
     * One or more `ebsConfig` blocks as defined below. Changing this forces a new resource to be created.
     */
    ebsConfigs?: pulumi.Input<pulumi.Input<inputs.emr.InstanceGroupEbsConfig>[]>;
    /**
     * Indicates whether an Amazon EBS volume is EBS-optimized. Changing this forces a new resource to be created.
     */
    ebsOptimized?: pulumi.Input<boolean>;
    /**
     * target number of instances for the instance group. defaults to 0.
     */
    instanceCount?: pulumi.Input<number>;
    /**
     * The EC2 instance type for all instances in the instance group. Changing this forces a new resource to be created.
     */
    instanceType: pulumi.Input<string>;
    /**
     * Human friendly name given to the instance group. Changing this forces a new resource to be created.
     */
    name?: pulumi.Input<string>;
}
