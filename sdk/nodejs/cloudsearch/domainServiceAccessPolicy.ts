// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Provides an CloudSearch domain service access policy resource.
 *
 * The provider waits for the domain service access policy to become `Active` when applying a configuration.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const exampleDomain = new aws.cloudsearch.Domain("example", {name: "example-domain"});
 * const example = aws.iam.getPolicyDocument({
 *     statements: [{
 *         sid: "search_only",
 *         effect: "Allow",
 *         principals: [{
 *             type: "*",
 *             identifiers: ["*"],
 *         }],
 *         actions: [
 *             "cloudsearch:search",
 *             "cloudsearch:document",
 *         ],
 *         conditions: [{
 *             test: "IpAddress",
 *             variable: "aws:SourceIp",
 *             values: ["192.0.2.0/32"],
 *         }],
 *     }],
 * });
 * const exampleDomainServiceAccessPolicy = new aws.cloudsearch.DomainServiceAccessPolicy("example", {
 *     domainName: exampleDomain.id,
 *     accessPolicy: example.then(example => example.json),
 * });
 * ```
 *
 * ## Import
 *
 * Using `pulumi import`, import CloudSearch domain service access policies using the domain name. For example:
 *
 * ```sh
 *  $ pulumi import aws:cloudsearch/domainServiceAccessPolicy:DomainServiceAccessPolicy example example-domain
 * ```
 */
export class DomainServiceAccessPolicy extends pulumi.CustomResource {
    /**
     * Get an existing DomainServiceAccessPolicy resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: DomainServiceAccessPolicyState, opts?: pulumi.CustomResourceOptions): DomainServiceAccessPolicy {
        return new DomainServiceAccessPolicy(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'aws:cloudsearch/domainServiceAccessPolicy:DomainServiceAccessPolicy';

    /**
     * Returns true if the given object is an instance of DomainServiceAccessPolicy.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is DomainServiceAccessPolicy {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === DomainServiceAccessPolicy.__pulumiType;
    }

    /**
     * The access rules you want to configure. These rules replace any existing rules. See the [AWS documentation](https://docs.aws.amazon.com/cloudsearch/latest/developerguide/configuring-access.html) for details.
     */
    public readonly accessPolicy!: pulumi.Output<string>;
    /**
     * The CloudSearch domain name the policy applies to.
     */
    public readonly domainName!: pulumi.Output<string>;

    /**
     * Create a DomainServiceAccessPolicy resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: DomainServiceAccessPolicyArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: DomainServiceAccessPolicyArgs | DomainServiceAccessPolicyState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as DomainServiceAccessPolicyState | undefined;
            resourceInputs["accessPolicy"] = state ? state.accessPolicy : undefined;
            resourceInputs["domainName"] = state ? state.domainName : undefined;
        } else {
            const args = argsOrState as DomainServiceAccessPolicyArgs | undefined;
            if ((!args || args.accessPolicy === undefined) && !opts.urn) {
                throw new Error("Missing required property 'accessPolicy'");
            }
            if ((!args || args.domainName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'domainName'");
            }
            resourceInputs["accessPolicy"] = args ? args.accessPolicy : undefined;
            resourceInputs["domainName"] = args ? args.domainName : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(DomainServiceAccessPolicy.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering DomainServiceAccessPolicy resources.
 */
export interface DomainServiceAccessPolicyState {
    /**
     * The access rules you want to configure. These rules replace any existing rules. See the [AWS documentation](https://docs.aws.amazon.com/cloudsearch/latest/developerguide/configuring-access.html) for details.
     */
    accessPolicy?: pulumi.Input<string>;
    /**
     * The CloudSearch domain name the policy applies to.
     */
    domainName?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a DomainServiceAccessPolicy resource.
 */
export interface DomainServiceAccessPolicyArgs {
    /**
     * The access rules you want to configure. These rules replace any existing rules. See the [AWS documentation](https://docs.aws.amazon.com/cloudsearch/latest/developerguide/configuring-access.html) for details.
     */
    accessPolicy: pulumi.Input<string>;
    /**
     * The CloudSearch domain name the policy applies to.
     */
    domainName: pulumi.Input<string>;
}
