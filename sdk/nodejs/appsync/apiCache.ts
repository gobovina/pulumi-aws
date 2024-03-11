// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Provides an AppSync API Cache.
 *
 * ## Example Usage
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const example = new aws.appsync.GraphQLApi("example", {
 *     authenticationType: "API_KEY",
 *     name: "example",
 * });
 * const exampleApiCache = new aws.appsync.ApiCache("example", {
 *     apiId: example.id,
 *     apiCachingBehavior: "FULL_REQUEST_CACHING",
 *     type: "LARGE",
 *     ttl: 900,
 * });
 * ```
 * <!--End PulumiCodeChooser -->
 *
 * ## Import
 *
 * Using `pulumi import`, import `aws_appsync_api_cache` using the AppSync API ID. For example:
 *
 * ```sh
 * $ pulumi import aws:appsync/apiCache:ApiCache example xxxxx
 * ```
 */
export class ApiCache extends pulumi.CustomResource {
    /**
     * Get an existing ApiCache resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ApiCacheState, opts?: pulumi.CustomResourceOptions): ApiCache {
        return new ApiCache(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'aws:appsync/apiCache:ApiCache';

    /**
     * Returns true if the given object is an instance of ApiCache.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is ApiCache {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === ApiCache.__pulumiType;
    }

    /**
     * Caching behavior. Valid values are `FULL_REQUEST_CACHING` and `PER_RESOLVER_CACHING`.
     */
    public readonly apiCachingBehavior!: pulumi.Output<string>;
    /**
     * GraphQL API ID.
     */
    public readonly apiId!: pulumi.Output<string>;
    /**
     * At-rest encryption flag for cache. You cannot update this setting after creation.
     */
    public readonly atRestEncryptionEnabled!: pulumi.Output<boolean | undefined>;
    /**
     * Transit encryption flag when connecting to cache. You cannot update this setting after creation.
     */
    public readonly transitEncryptionEnabled!: pulumi.Output<boolean | undefined>;
    /**
     * TTL in seconds for cache entries.
     */
    public readonly ttl!: pulumi.Output<number>;
    /**
     * Cache instance type. Valid values are `SMALL`, `MEDIUM`, `LARGE`, `XLARGE`, `LARGE_2X`, `LARGE_4X`, `LARGE_8X`, `LARGE_12X`, `T2_SMALL`, `T2_MEDIUM`, `R4_LARGE`, `R4_XLARGE`, `R4_2XLARGE`, `R4_4XLARGE`, `R4_8XLARGE`.
     */
    public readonly type!: pulumi.Output<string>;

    /**
     * Create a ApiCache resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: ApiCacheArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ApiCacheArgs | ApiCacheState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as ApiCacheState | undefined;
            resourceInputs["apiCachingBehavior"] = state ? state.apiCachingBehavior : undefined;
            resourceInputs["apiId"] = state ? state.apiId : undefined;
            resourceInputs["atRestEncryptionEnabled"] = state ? state.atRestEncryptionEnabled : undefined;
            resourceInputs["transitEncryptionEnabled"] = state ? state.transitEncryptionEnabled : undefined;
            resourceInputs["ttl"] = state ? state.ttl : undefined;
            resourceInputs["type"] = state ? state.type : undefined;
        } else {
            const args = argsOrState as ApiCacheArgs | undefined;
            if ((!args || args.apiCachingBehavior === undefined) && !opts.urn) {
                throw new Error("Missing required property 'apiCachingBehavior'");
            }
            if ((!args || args.apiId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'apiId'");
            }
            if ((!args || args.ttl === undefined) && !opts.urn) {
                throw new Error("Missing required property 'ttl'");
            }
            if ((!args || args.type === undefined) && !opts.urn) {
                throw new Error("Missing required property 'type'");
            }
            resourceInputs["apiCachingBehavior"] = args ? args.apiCachingBehavior : undefined;
            resourceInputs["apiId"] = args ? args.apiId : undefined;
            resourceInputs["atRestEncryptionEnabled"] = args ? args.atRestEncryptionEnabled : undefined;
            resourceInputs["transitEncryptionEnabled"] = args ? args.transitEncryptionEnabled : undefined;
            resourceInputs["ttl"] = args ? args.ttl : undefined;
            resourceInputs["type"] = args ? args.type : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(ApiCache.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering ApiCache resources.
 */
export interface ApiCacheState {
    /**
     * Caching behavior. Valid values are `FULL_REQUEST_CACHING` and `PER_RESOLVER_CACHING`.
     */
    apiCachingBehavior?: pulumi.Input<string>;
    /**
     * GraphQL API ID.
     */
    apiId?: pulumi.Input<string>;
    /**
     * At-rest encryption flag for cache. You cannot update this setting after creation.
     */
    atRestEncryptionEnabled?: pulumi.Input<boolean>;
    /**
     * Transit encryption flag when connecting to cache. You cannot update this setting after creation.
     */
    transitEncryptionEnabled?: pulumi.Input<boolean>;
    /**
     * TTL in seconds for cache entries.
     */
    ttl?: pulumi.Input<number>;
    /**
     * Cache instance type. Valid values are `SMALL`, `MEDIUM`, `LARGE`, `XLARGE`, `LARGE_2X`, `LARGE_4X`, `LARGE_8X`, `LARGE_12X`, `T2_SMALL`, `T2_MEDIUM`, `R4_LARGE`, `R4_XLARGE`, `R4_2XLARGE`, `R4_4XLARGE`, `R4_8XLARGE`.
     */
    type?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a ApiCache resource.
 */
export interface ApiCacheArgs {
    /**
     * Caching behavior. Valid values are `FULL_REQUEST_CACHING` and `PER_RESOLVER_CACHING`.
     */
    apiCachingBehavior: pulumi.Input<string>;
    /**
     * GraphQL API ID.
     */
    apiId: pulumi.Input<string>;
    /**
     * At-rest encryption flag for cache. You cannot update this setting after creation.
     */
    atRestEncryptionEnabled?: pulumi.Input<boolean>;
    /**
     * Transit encryption flag when connecting to cache. You cannot update this setting after creation.
     */
    transitEncryptionEnabled?: pulumi.Input<boolean>;
    /**
     * TTL in seconds for cache entries.
     */
    ttl: pulumi.Input<number>;
    /**
     * Cache instance type. Valid values are `SMALL`, `MEDIUM`, `LARGE`, `XLARGE`, `LARGE_2X`, `LARGE_4X`, `LARGE_8X`, `LARGE_12X`, `T2_SMALL`, `T2_MEDIUM`, `R4_LARGE`, `R4_XLARGE`, `R4_2XLARGE`, `R4_4XLARGE`, `R4_8XLARGE`.
     */
    type: pulumi.Input<string>;
}
