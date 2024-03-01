// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Provides a resource for adding an IAM User to IAM Groups. This
 * resource can be used multiple times with the same user for non-overlapping
 * groups.
 *
 * To exclusively manage the users in a group, see the
 * `aws.iam.GroupMembership` resource.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const user1 = new aws.iam.User("user1", {name: "user1"});
 * const group1 = new aws.iam.Group("group1", {name: "group1"});
 * const group2 = new aws.iam.Group("group2", {name: "group2"});
 * const example1 = new aws.iam.UserGroupMembership("example1", {
 *     user: user1.name,
 *     groups: [
 *         group1.name,
 *         group2.name,
 *     ],
 * });
 * const group3 = new aws.iam.Group("group3", {name: "group3"});
 * const example2 = new aws.iam.UserGroupMembership("example2", {
 *     user: user1.name,
 *     groups: [group3.name],
 * });
 * ```
 *
 * ## Import
 *
 * Using `pulumi import`, import IAM user group membership using the user name and group names separated by `/`. For example:
 *
 * ```sh
 *  $ pulumi import aws:iam/userGroupMembership:UserGroupMembership example1 user1/group1/group2
 * ```
 */
export class UserGroupMembership extends pulumi.CustomResource {
    /**
     * Get an existing UserGroupMembership resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: UserGroupMembershipState, opts?: pulumi.CustomResourceOptions): UserGroupMembership {
        return new UserGroupMembership(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'aws:iam/userGroupMembership:UserGroupMembership';

    /**
     * Returns true if the given object is an instance of UserGroupMembership.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is UserGroupMembership {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === UserGroupMembership.__pulumiType;
    }

    /**
     * A list of IAM Groups to add the user to
     */
    public readonly groups!: pulumi.Output<string[]>;
    /**
     * The name of the IAM User to add to groups
     */
    public readonly user!: pulumi.Output<string>;

    /**
     * Create a UserGroupMembership resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: UserGroupMembershipArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: UserGroupMembershipArgs | UserGroupMembershipState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as UserGroupMembershipState | undefined;
            resourceInputs["groups"] = state ? state.groups : undefined;
            resourceInputs["user"] = state ? state.user : undefined;
        } else {
            const args = argsOrState as UserGroupMembershipArgs | undefined;
            if ((!args || args.groups === undefined) && !opts.urn) {
                throw new Error("Missing required property 'groups'");
            }
            if ((!args || args.user === undefined) && !opts.urn) {
                throw new Error("Missing required property 'user'");
            }
            resourceInputs["groups"] = args ? args.groups : undefined;
            resourceInputs["user"] = args ? args.user : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(UserGroupMembership.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering UserGroupMembership resources.
 */
export interface UserGroupMembershipState {
    /**
     * A list of IAM Groups to add the user to
     */
    groups?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The name of the IAM User to add to groups
     */
    user?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a UserGroupMembership resource.
 */
export interface UserGroupMembershipArgs {
    /**
     * A list of IAM Groups to add the user to
     */
    groups: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The name of the IAM User to add to groups
     */
    user: pulumi.Input<string>;
}
