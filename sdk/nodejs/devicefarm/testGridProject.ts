// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as enums from "../types/enums";
import * as utilities from "../utilities";

/**
 * Provides a resource to manage AWS Device Farm Test Grid Projects.
 *
 * > **NOTE:** AWS currently has limited regional support for Device Farm (e.g., `us-west-2`). See [AWS Device Farm endpoints and quotas](https://docs.aws.amazon.com/general/latest/gr/devicefarm.html) for information on supported regions.
 *
 * ## Import
 *
 * Using `pulumi import`, import DeviceFarm Test Grid Projects using their ARN. For example:
 *
 * ```sh
 *  $ pulumi import aws:devicefarm/testGridProject:TestGridProject example arn:aws:devicefarm:us-west-2:123456789012:testgrid-project:4fa784c7-ccb4-4dbf-ba4f-02198320daa1
 * ```
 */
export class TestGridProject extends pulumi.CustomResource {
    /**
     * Get an existing TestGridProject resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: TestGridProjectState, opts?: pulumi.CustomResourceOptions): TestGridProject {
        return new TestGridProject(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'aws:devicefarm/testGridProject:TestGridProject';

    /**
     * Returns true if the given object is an instance of TestGridProject.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is TestGridProject {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === TestGridProject.__pulumiType;
    }

    /**
     * The Amazon Resource Name of this Test Grid Project.
     */
    public /*out*/ readonly arn!: pulumi.Output<string>;
    /**
     * Human-readable description of the project.
     */
    public readonly description!: pulumi.Output<string | undefined>;
    /**
     * The name of the Selenium testing project.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * A map of tags to assign to the resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    public readonly tags!: pulumi.Output<{[key: string]: string} | undefined>;
    /**
     * A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
     */
    public /*out*/ readonly tagsAll!: pulumi.Output<{[key: string]: string}>;
    /**
     * The VPC security groups and subnets that are attached to a project. See VPC Config below.
     */
    public readonly vpcConfig!: pulumi.Output<outputs.devicefarm.TestGridProjectVpcConfig | undefined>;

    /**
     * Create a TestGridProject resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args?: TestGridProjectArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: TestGridProjectArgs | TestGridProjectState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as TestGridProjectState | undefined;
            resourceInputs["arn"] = state ? state.arn : undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
            resourceInputs["tagsAll"] = state ? state.tagsAll : undefined;
            resourceInputs["vpcConfig"] = state ? state.vpcConfig : undefined;
        } else {
            const args = argsOrState as TestGridProjectArgs | undefined;
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
            resourceInputs["vpcConfig"] = args ? args.vpcConfig : undefined;
            resourceInputs["arn"] = undefined /*out*/;
            resourceInputs["tagsAll"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(TestGridProject.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering TestGridProject resources.
 */
export interface TestGridProjectState {
    /**
     * The Amazon Resource Name of this Test Grid Project.
     */
    arn?: pulumi.Input<string>;
    /**
     * Human-readable description of the project.
     */
    description?: pulumi.Input<string>;
    /**
     * The name of the Selenium testing project.
     */
    name?: pulumi.Input<string>;
    /**
     * A map of tags to assign to the resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
     */
    tagsAll?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * The VPC security groups and subnets that are attached to a project. See VPC Config below.
     */
    vpcConfig?: pulumi.Input<inputs.devicefarm.TestGridProjectVpcConfig>;
}

/**
 * The set of arguments for constructing a TestGridProject resource.
 */
export interface TestGridProjectArgs {
    /**
     * Human-readable description of the project.
     */
    description?: pulumi.Input<string>;
    /**
     * The name of the Selenium testing project.
     */
    name?: pulumi.Input<string>;
    /**
     * A map of tags to assign to the resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * The VPC security groups and subnets that are attached to a project. See VPC Config below.
     */
    vpcConfig?: pulumi.Input<inputs.devicefarm.TestGridProjectVpcConfig>;
}
