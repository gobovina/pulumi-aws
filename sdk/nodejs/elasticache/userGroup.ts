// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Provides an ElastiCache user group resource.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const testUser = new aws.elasticache.User("testUser", {
 *     userId: "testUserId",
 *     userName: "default",
 *     accessString: "on ~app::* -@all +@read +@hash +@bitmap +@geo -setbit -bitfield -hset -hsetnx -hmset -hincrby -hincrbyfloat -hdel -bitop -geoadd -georadius -georadiusbymember",
 *     engine: "REDIS",
 *     passwords: ["password123456789"],
 * });
 * const testUserGroup = new aws.elasticache.UserGroup("testUserGroup", {
 *     engine: "REDIS",
 *     userGroupId: "userGroupId",
 *     userIds: [testUser.userId],
 * });
 * ```
 *
 * ## Import
 *
 * Using `pulumi import`, import ElastiCache user groups using the `user_group_id`. For example:
 *
 * ```sh
 *  $ pulumi import aws:elasticache/userGroup:UserGroup my_user_group userGoupId1
 * ```
 */
export class UserGroup extends pulumi.CustomResource {
    /**
     * Get an existing UserGroup resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: UserGroupState, opts?: pulumi.CustomResourceOptions): UserGroup {
        return new UserGroup(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'aws:elasticache/userGroup:UserGroup';

    /**
     * Returns true if the given object is an instance of UserGroup.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is UserGroup {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === UserGroup.__pulumiType;
    }

    /**
     * The ARN that identifies the user group.
     */
    public /*out*/ readonly arn!: pulumi.Output<string>;
    /**
     * The current supported value is `REDIS`.
     */
    public readonly engine!: pulumi.Output<string>;
    /**
     * Key-value map of resource tags. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    public readonly tags!: pulumi.Output<{[key: string]: string} | undefined>;
    /**
     * A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
     */
    public /*out*/ readonly tagsAll!: pulumi.Output<{[key: string]: string}>;
    /**
     * The ID of the user group.
     *
     * The following arguments are optional:
     */
    public readonly userGroupId!: pulumi.Output<string>;
    /**
     * The list of user IDs that belong to the user group.
     */
    public readonly userIds!: pulumi.Output<string[] | undefined>;

    /**
     * Create a UserGroup resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: UserGroupArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: UserGroupArgs | UserGroupState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as UserGroupState | undefined;
            resourceInputs["arn"] = state ? state.arn : undefined;
            resourceInputs["engine"] = state ? state.engine : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
            resourceInputs["tagsAll"] = state ? state.tagsAll : undefined;
            resourceInputs["userGroupId"] = state ? state.userGroupId : undefined;
            resourceInputs["userIds"] = state ? state.userIds : undefined;
        } else {
            const args = argsOrState as UserGroupArgs | undefined;
            if ((!args || args.engine === undefined) && !opts.urn) {
                throw new Error("Missing required property 'engine'");
            }
            if ((!args || args.userGroupId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'userGroupId'");
            }
            resourceInputs["engine"] = args ? args.engine : undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
            resourceInputs["userGroupId"] = args ? args.userGroupId : undefined;
            resourceInputs["userIds"] = args ? args.userIds : undefined;
            resourceInputs["arn"] = undefined /*out*/;
            resourceInputs["tagsAll"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(UserGroup.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering UserGroup resources.
 */
export interface UserGroupState {
    /**
     * The ARN that identifies the user group.
     */
    arn?: pulumi.Input<string>;
    /**
     * The current supported value is `REDIS`.
     */
    engine?: pulumi.Input<string>;
    /**
     * Key-value map of resource tags. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
     */
    tagsAll?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * The ID of the user group.
     *
     * The following arguments are optional:
     */
    userGroupId?: pulumi.Input<string>;
    /**
     * The list of user IDs that belong to the user group.
     */
    userIds?: pulumi.Input<pulumi.Input<string>[]>;
}

/**
 * The set of arguments for constructing a UserGroup resource.
 */
export interface UserGroupArgs {
    /**
     * The current supported value is `REDIS`.
     */
    engine: pulumi.Input<string>;
    /**
     * Key-value map of resource tags. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * The ID of the user group.
     *
     * The following arguments are optional:
     */
    userGroupId: pulumi.Input<string>;
    /**
     * The list of user IDs that belong to the user group.
     */
    userIds?: pulumi.Input<pulumi.Input<string>[]>;
}
