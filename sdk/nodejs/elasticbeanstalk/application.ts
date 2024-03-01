// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as enums from "../types/enums";
import * as utilities from "../utilities";

/**
 * Provides an Elastic Beanstalk Application Resource. Elastic Beanstalk allows
 * you to deploy and manage applications in the AWS cloud without worrying about
 * the infrastructure that runs those applications.
 *
 * This resource creates an application that has one configuration template named
 * `default`, and no application versions
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const tftest = new aws.elasticbeanstalk.Application("tftest", {
 *     name: "tf-test-name",
 *     description: "tf-test-desc",
 *     appversionLifecycle: {
 *         serviceRole: beanstalkService.arn,
 *         maxCount: 128,
 *         deleteSourceFromS3: true,
 *     },
 * });
 * ```
 *
 * ## Import
 *
 * Using `pulumi import`, import Elastic Beanstalk Applications using the `name`. For example:
 *
 * ```sh
 *  $ pulumi import aws:elasticbeanstalk/application:Application tf_test tf-test-name
 * ```
 */
export class Application extends pulumi.CustomResource {
    /**
     * Get an existing Application resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ApplicationState, opts?: pulumi.CustomResourceOptions): Application {
        return new Application(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'aws:elasticbeanstalk/application:Application';

    /**
     * Returns true if the given object is an instance of Application.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Application {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Application.__pulumiType;
    }

    public readonly appversionLifecycle!: pulumi.Output<outputs.elasticbeanstalk.ApplicationAppversionLifecycle | undefined>;
    /**
     * The ARN assigned by AWS for this Elastic Beanstalk Application.
     */
    public /*out*/ readonly arn!: pulumi.Output<string>;
    /**
     * Short description of the application
     */
    public readonly description!: pulumi.Output<string | undefined>;
    /**
     * The name of the application, must be unique within your account
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * Key-value map of tags for the Elastic Beanstalk Application. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    public readonly tags!: pulumi.Output<{[key: string]: string} | undefined>;
    /**
     * A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
     *
     * @deprecated Please use `tags` instead.
     */
    public /*out*/ readonly tagsAll!: pulumi.Output<{[key: string]: string}>;

    /**
     * Create a Application resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args?: ApplicationArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ApplicationArgs | ApplicationState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as ApplicationState | undefined;
            resourceInputs["appversionLifecycle"] = state ? state.appversionLifecycle : undefined;
            resourceInputs["arn"] = state ? state.arn : undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
            resourceInputs["tagsAll"] = state ? state.tagsAll : undefined;
        } else {
            const args = argsOrState as ApplicationArgs | undefined;
            resourceInputs["appversionLifecycle"] = args ? args.appversionLifecycle : undefined;
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
            resourceInputs["arn"] = undefined /*out*/;
            resourceInputs["tagsAll"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(Application.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Application resources.
 */
export interface ApplicationState {
    appversionLifecycle?: pulumi.Input<inputs.elasticbeanstalk.ApplicationAppversionLifecycle>;
    /**
     * The ARN assigned by AWS for this Elastic Beanstalk Application.
     */
    arn?: pulumi.Input<string>;
    /**
     * Short description of the application
     */
    description?: pulumi.Input<string>;
    /**
     * The name of the application, must be unique within your account
     */
    name?: pulumi.Input<string>;
    /**
     * Key-value map of tags for the Elastic Beanstalk Application. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
     *
     * @deprecated Please use `tags` instead.
     */
    tagsAll?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
}

/**
 * The set of arguments for constructing a Application resource.
 */
export interface ApplicationArgs {
    appversionLifecycle?: pulumi.Input<inputs.elasticbeanstalk.ApplicationAppversionLifecycle>;
    /**
     * Short description of the application
     */
    description?: pulumi.Input<string>;
    /**
     * The name of the application, must be unique within your account
     */
    name?: pulumi.Input<string>;
    /**
     * Key-value map of tags for the Elastic Beanstalk Application. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
}
