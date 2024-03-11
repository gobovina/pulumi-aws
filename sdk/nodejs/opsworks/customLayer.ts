// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as enums from "../types/enums";
import * as utilities from "../utilities";

/**
 * Provides an OpsWorks custom layer resource.
 *
 * ## Example Usage
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const custlayer = new aws.opsworks.CustomLayer("custlayer", {
 *     name: "My Awesome Custom Layer",
 *     shortName: "awesome",
 *     stackId: main.id,
 * });
 * ```
 * <!--End PulumiCodeChooser -->
 *
 * ## Import
 *
 * Using `pulumi import`, import OpsWorks Custom Layers using the `id`. For example:
 *
 * ```sh
 * $ pulumi import aws:opsworks/customLayer:CustomLayer bar 00000000-0000-0000-0000-000000000000
 * ```
 */
export class CustomLayer extends pulumi.CustomResource {
    /**
     * Get an existing CustomLayer resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: CustomLayerState, opts?: pulumi.CustomResourceOptions): CustomLayer {
        return new CustomLayer(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'aws:opsworks/customLayer:CustomLayer';

    /**
     * Returns true if the given object is an instance of CustomLayer.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is CustomLayer {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === CustomLayer.__pulumiType;
    }

    /**
     * The Amazon Resource Name(ARN) of the layer.
     */
    public /*out*/ readonly arn!: pulumi.Output<string>;
    /**
     * Whether to automatically assign an elastic IP address to the layer's instances.
     */
    public readonly autoAssignElasticIps!: pulumi.Output<boolean | undefined>;
    /**
     * For stacks belonging to a VPC, whether to automatically assign a public IP address to each of the layer's instances.
     */
    public readonly autoAssignPublicIps!: pulumi.Output<boolean | undefined>;
    /**
     * Whether to enable auto-healing for the layer.
     */
    public readonly autoHealing!: pulumi.Output<boolean | undefined>;
    /**
     * Will create an EBS volume and connect it to the layer's instances. See Cloudwatch Configuration.
     */
    public readonly cloudwatchConfiguration!: pulumi.Output<outputs.opsworks.CustomLayerCloudwatchConfiguration | undefined>;
    public readonly customConfigureRecipes!: pulumi.Output<string[] | undefined>;
    public readonly customDeployRecipes!: pulumi.Output<string[] | undefined>;
    /**
     * The ARN of an IAM profile that will be used for the layer's instances.
     */
    public readonly customInstanceProfileArn!: pulumi.Output<string | undefined>;
    /**
     * Custom JSON attributes to apply to the layer.
     */
    public readonly customJson!: pulumi.Output<string | undefined>;
    /**
     * Ids for a set of security groups to apply to the layer's instances.
     */
    public readonly customSecurityGroupIds!: pulumi.Output<string[] | undefined>;
    public readonly customSetupRecipes!: pulumi.Output<string[] | undefined>;
    public readonly customShutdownRecipes!: pulumi.Output<string[] | undefined>;
    public readonly customUndeployRecipes!: pulumi.Output<string[] | undefined>;
    /**
     * Whether to enable Elastic Load Balancing connection draining.
     */
    public readonly drainElbOnShutdown!: pulumi.Output<boolean | undefined>;
    /**
     * Will create an EBS volume and connect it to the layer's instances. See EBS Volume.
     */
    public readonly ebsVolumes!: pulumi.Output<outputs.opsworks.CustomLayerEbsVolume[]>;
    /**
     * Name of an Elastic Load Balancer to attach to this layer
     */
    public readonly elasticLoadBalancer!: pulumi.Output<string | undefined>;
    /**
     * Whether to install OS and package updates on each instance when it boots.
     */
    public readonly installUpdatesOnBoot!: pulumi.Output<boolean | undefined>;
    /**
     * The time, in seconds, that OpsWorks will wait for Chef to complete after triggering the Shutdown event.
     */
    public readonly instanceShutdownTimeout!: pulumi.Output<number | undefined>;
    /**
     * Load-based auto scaling configuration. See Load Based AutoScaling
     */
    public readonly loadBasedAutoScaling!: pulumi.Output<outputs.opsworks.CustomLayerLoadBasedAutoScaling>;
    /**
     * A human-readable name for the layer.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * A short, machine-readable name for the layer, which will be used to identify it in the Chef node JSON.
     */
    public readonly shortName!: pulumi.Output<string>;
    /**
     * ID of the stack the layer will belong to.
     */
    public readonly stackId!: pulumi.Output<string>;
    /**
     * Names of a set of system packages to install on the layer's instances.
     */
    public readonly systemPackages!: pulumi.Output<string[] | undefined>;
    /**
     * A map of tags to assign to the resource. .If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     *
     * The following extra optional arguments, all lists of Chef recipe names, allow
     * custom Chef recipes to be applied to layer instances at the five different
     * lifecycle events, if custom cookbooks are enabled on the layer's stack:
     */
    public readonly tags!: pulumi.Output<{[key: string]: string} | undefined>;
    /**
     * A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
     *
     * @deprecated Please use `tags` instead.
     */
    public /*out*/ readonly tagsAll!: pulumi.Output<{[key: string]: string}>;
    /**
     * Whether to use EBS-optimized instances.
     */
    public readonly useEbsOptimizedInstances!: pulumi.Output<boolean | undefined>;

    /**
     * Create a CustomLayer resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: CustomLayerArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: CustomLayerArgs | CustomLayerState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as CustomLayerState | undefined;
            resourceInputs["arn"] = state ? state.arn : undefined;
            resourceInputs["autoAssignElasticIps"] = state ? state.autoAssignElasticIps : undefined;
            resourceInputs["autoAssignPublicIps"] = state ? state.autoAssignPublicIps : undefined;
            resourceInputs["autoHealing"] = state ? state.autoHealing : undefined;
            resourceInputs["cloudwatchConfiguration"] = state ? state.cloudwatchConfiguration : undefined;
            resourceInputs["customConfigureRecipes"] = state ? state.customConfigureRecipes : undefined;
            resourceInputs["customDeployRecipes"] = state ? state.customDeployRecipes : undefined;
            resourceInputs["customInstanceProfileArn"] = state ? state.customInstanceProfileArn : undefined;
            resourceInputs["customJson"] = state ? state.customJson : undefined;
            resourceInputs["customSecurityGroupIds"] = state ? state.customSecurityGroupIds : undefined;
            resourceInputs["customSetupRecipes"] = state ? state.customSetupRecipes : undefined;
            resourceInputs["customShutdownRecipes"] = state ? state.customShutdownRecipes : undefined;
            resourceInputs["customUndeployRecipes"] = state ? state.customUndeployRecipes : undefined;
            resourceInputs["drainElbOnShutdown"] = state ? state.drainElbOnShutdown : undefined;
            resourceInputs["ebsVolumes"] = state ? state.ebsVolumes : undefined;
            resourceInputs["elasticLoadBalancer"] = state ? state.elasticLoadBalancer : undefined;
            resourceInputs["installUpdatesOnBoot"] = state ? state.installUpdatesOnBoot : undefined;
            resourceInputs["instanceShutdownTimeout"] = state ? state.instanceShutdownTimeout : undefined;
            resourceInputs["loadBasedAutoScaling"] = state ? state.loadBasedAutoScaling : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["shortName"] = state ? state.shortName : undefined;
            resourceInputs["stackId"] = state ? state.stackId : undefined;
            resourceInputs["systemPackages"] = state ? state.systemPackages : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
            resourceInputs["tagsAll"] = state ? state.tagsAll : undefined;
            resourceInputs["useEbsOptimizedInstances"] = state ? state.useEbsOptimizedInstances : undefined;
        } else {
            const args = argsOrState as CustomLayerArgs | undefined;
            if ((!args || args.shortName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'shortName'");
            }
            if ((!args || args.stackId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'stackId'");
            }
            resourceInputs["autoAssignElasticIps"] = args ? args.autoAssignElasticIps : undefined;
            resourceInputs["autoAssignPublicIps"] = args ? args.autoAssignPublicIps : undefined;
            resourceInputs["autoHealing"] = args ? args.autoHealing : undefined;
            resourceInputs["cloudwatchConfiguration"] = args ? args.cloudwatchConfiguration : undefined;
            resourceInputs["customConfigureRecipes"] = args ? args.customConfigureRecipes : undefined;
            resourceInputs["customDeployRecipes"] = args ? args.customDeployRecipes : undefined;
            resourceInputs["customInstanceProfileArn"] = args ? args.customInstanceProfileArn : undefined;
            resourceInputs["customJson"] = args ? args.customJson : undefined;
            resourceInputs["customSecurityGroupIds"] = args ? args.customSecurityGroupIds : undefined;
            resourceInputs["customSetupRecipes"] = args ? args.customSetupRecipes : undefined;
            resourceInputs["customShutdownRecipes"] = args ? args.customShutdownRecipes : undefined;
            resourceInputs["customUndeployRecipes"] = args ? args.customUndeployRecipes : undefined;
            resourceInputs["drainElbOnShutdown"] = args ? args.drainElbOnShutdown : undefined;
            resourceInputs["ebsVolumes"] = args ? args.ebsVolumes : undefined;
            resourceInputs["elasticLoadBalancer"] = args ? args.elasticLoadBalancer : undefined;
            resourceInputs["installUpdatesOnBoot"] = args ? args.installUpdatesOnBoot : undefined;
            resourceInputs["instanceShutdownTimeout"] = args ? args.instanceShutdownTimeout : undefined;
            resourceInputs["loadBasedAutoScaling"] = args ? args.loadBasedAutoScaling : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["shortName"] = args ? args.shortName : undefined;
            resourceInputs["stackId"] = args ? args.stackId : undefined;
            resourceInputs["systemPackages"] = args ? args.systemPackages : undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
            resourceInputs["useEbsOptimizedInstances"] = args ? args.useEbsOptimizedInstances : undefined;
            resourceInputs["arn"] = undefined /*out*/;
            resourceInputs["tagsAll"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(CustomLayer.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering CustomLayer resources.
 */
export interface CustomLayerState {
    /**
     * The Amazon Resource Name(ARN) of the layer.
     */
    arn?: pulumi.Input<string>;
    /**
     * Whether to automatically assign an elastic IP address to the layer's instances.
     */
    autoAssignElasticIps?: pulumi.Input<boolean>;
    /**
     * For stacks belonging to a VPC, whether to automatically assign a public IP address to each of the layer's instances.
     */
    autoAssignPublicIps?: pulumi.Input<boolean>;
    /**
     * Whether to enable auto-healing for the layer.
     */
    autoHealing?: pulumi.Input<boolean>;
    /**
     * Will create an EBS volume and connect it to the layer's instances. See Cloudwatch Configuration.
     */
    cloudwatchConfiguration?: pulumi.Input<inputs.opsworks.CustomLayerCloudwatchConfiguration>;
    customConfigureRecipes?: pulumi.Input<pulumi.Input<string>[]>;
    customDeployRecipes?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The ARN of an IAM profile that will be used for the layer's instances.
     */
    customInstanceProfileArn?: pulumi.Input<string>;
    /**
     * Custom JSON attributes to apply to the layer.
     */
    customJson?: pulumi.Input<string>;
    /**
     * Ids for a set of security groups to apply to the layer's instances.
     */
    customSecurityGroupIds?: pulumi.Input<pulumi.Input<string>[]>;
    customSetupRecipes?: pulumi.Input<pulumi.Input<string>[]>;
    customShutdownRecipes?: pulumi.Input<pulumi.Input<string>[]>;
    customUndeployRecipes?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Whether to enable Elastic Load Balancing connection draining.
     */
    drainElbOnShutdown?: pulumi.Input<boolean>;
    /**
     * Will create an EBS volume and connect it to the layer's instances. See EBS Volume.
     */
    ebsVolumes?: pulumi.Input<pulumi.Input<inputs.opsworks.CustomLayerEbsVolume>[]>;
    /**
     * Name of an Elastic Load Balancer to attach to this layer
     */
    elasticLoadBalancer?: pulumi.Input<string>;
    /**
     * Whether to install OS and package updates on each instance when it boots.
     */
    installUpdatesOnBoot?: pulumi.Input<boolean>;
    /**
     * The time, in seconds, that OpsWorks will wait for Chef to complete after triggering the Shutdown event.
     */
    instanceShutdownTimeout?: pulumi.Input<number>;
    /**
     * Load-based auto scaling configuration. See Load Based AutoScaling
     */
    loadBasedAutoScaling?: pulumi.Input<inputs.opsworks.CustomLayerLoadBasedAutoScaling>;
    /**
     * A human-readable name for the layer.
     */
    name?: pulumi.Input<string>;
    /**
     * A short, machine-readable name for the layer, which will be used to identify it in the Chef node JSON.
     */
    shortName?: pulumi.Input<string>;
    /**
     * ID of the stack the layer will belong to.
     */
    stackId?: pulumi.Input<string>;
    /**
     * Names of a set of system packages to install on the layer's instances.
     */
    systemPackages?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * A map of tags to assign to the resource. .If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     *
     * The following extra optional arguments, all lists of Chef recipe names, allow
     * custom Chef recipes to be applied to layer instances at the five different
     * lifecycle events, if custom cookbooks are enabled on the layer's stack:
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
     *
     * @deprecated Please use `tags` instead.
     */
    tagsAll?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * Whether to use EBS-optimized instances.
     */
    useEbsOptimizedInstances?: pulumi.Input<boolean>;
}

/**
 * The set of arguments for constructing a CustomLayer resource.
 */
export interface CustomLayerArgs {
    /**
     * Whether to automatically assign an elastic IP address to the layer's instances.
     */
    autoAssignElasticIps?: pulumi.Input<boolean>;
    /**
     * For stacks belonging to a VPC, whether to automatically assign a public IP address to each of the layer's instances.
     */
    autoAssignPublicIps?: pulumi.Input<boolean>;
    /**
     * Whether to enable auto-healing for the layer.
     */
    autoHealing?: pulumi.Input<boolean>;
    /**
     * Will create an EBS volume and connect it to the layer's instances. See Cloudwatch Configuration.
     */
    cloudwatchConfiguration?: pulumi.Input<inputs.opsworks.CustomLayerCloudwatchConfiguration>;
    customConfigureRecipes?: pulumi.Input<pulumi.Input<string>[]>;
    customDeployRecipes?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The ARN of an IAM profile that will be used for the layer's instances.
     */
    customInstanceProfileArn?: pulumi.Input<string>;
    /**
     * Custom JSON attributes to apply to the layer.
     */
    customJson?: pulumi.Input<string>;
    /**
     * Ids for a set of security groups to apply to the layer's instances.
     */
    customSecurityGroupIds?: pulumi.Input<pulumi.Input<string>[]>;
    customSetupRecipes?: pulumi.Input<pulumi.Input<string>[]>;
    customShutdownRecipes?: pulumi.Input<pulumi.Input<string>[]>;
    customUndeployRecipes?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Whether to enable Elastic Load Balancing connection draining.
     */
    drainElbOnShutdown?: pulumi.Input<boolean>;
    /**
     * Will create an EBS volume and connect it to the layer's instances. See EBS Volume.
     */
    ebsVolumes?: pulumi.Input<pulumi.Input<inputs.opsworks.CustomLayerEbsVolume>[]>;
    /**
     * Name of an Elastic Load Balancer to attach to this layer
     */
    elasticLoadBalancer?: pulumi.Input<string>;
    /**
     * Whether to install OS and package updates on each instance when it boots.
     */
    installUpdatesOnBoot?: pulumi.Input<boolean>;
    /**
     * The time, in seconds, that OpsWorks will wait for Chef to complete after triggering the Shutdown event.
     */
    instanceShutdownTimeout?: pulumi.Input<number>;
    /**
     * Load-based auto scaling configuration. See Load Based AutoScaling
     */
    loadBasedAutoScaling?: pulumi.Input<inputs.opsworks.CustomLayerLoadBasedAutoScaling>;
    /**
     * A human-readable name for the layer.
     */
    name?: pulumi.Input<string>;
    /**
     * A short, machine-readable name for the layer, which will be used to identify it in the Chef node JSON.
     */
    shortName: pulumi.Input<string>;
    /**
     * ID of the stack the layer will belong to.
     */
    stackId: pulumi.Input<string>;
    /**
     * Names of a set of system packages to install on the layer's instances.
     */
    systemPackages?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * A map of tags to assign to the resource. .If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     *
     * The following extra optional arguments, all lists of Chef recipe names, allow
     * custom Chef recipes to be applied to layer instances at the five different
     * lifecycle events, if custom cookbooks are enabled on the layer's stack:
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * Whether to use EBS-optimized instances.
     */
    useEbsOptimizedInstances?: pulumi.Input<boolean>;
}
