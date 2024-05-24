// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.elasticache;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.elasticache.ServerlessCacheArgs;
import com.pulumi.aws.elasticache.inputs.ServerlessCacheState;
import com.pulumi.aws.elasticache.outputs.ServerlessCacheCacheUsageLimits;
import com.pulumi.aws.elasticache.outputs.ServerlessCacheEndpoint;
import com.pulumi.aws.elasticache.outputs.ServerlessCacheReaderEndpoint;
import com.pulumi.aws.elasticache.outputs.ServerlessCacheTimeouts;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides an ElastiCache Serverless Cache resource which manages memcached or redis.
 * 
 * ## Example Usage
 * 
 * ### Memcached Serverless
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.elasticache.ServerlessCache;
 * import com.pulumi.aws.elasticache.ServerlessCacheArgs;
 * import com.pulumi.aws.elasticache.inputs.ServerlessCacheCacheUsageLimitsArgs;
 * import com.pulumi.aws.elasticache.inputs.ServerlessCacheCacheUsageLimitsDataStorageArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var example = new ServerlessCache("example", ServerlessCacheArgs.builder()
 *             .engine("memcached")
 *             .name("example")
 *             .cacheUsageLimits(ServerlessCacheCacheUsageLimitsArgs.builder()
 *                 .dataStorage(ServerlessCacheCacheUsageLimitsDataStorageArgs.builder()
 *                     .maximum(10)
 *                     .unit("GB")
 *                     .build())
 *                 .ecpuPerSeconds(ServerlessCacheCacheUsageLimitsEcpuPerSecondArgs.builder()
 *                     .maximum(5000)
 *                     .build())
 *                 .build())
 *             .description("Test Server")
 *             .kmsKeyId(test.arn())
 *             .majorEngineVersion("1.6")
 *             .securityGroupIds(testAwsSecurityGroup.id())
 *             .subnetIds(testAwsSubnet.stream().map(element -> element.id()).collect(toList()))
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ### Redis Serverless
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.elasticache.ServerlessCache;
 * import com.pulumi.aws.elasticache.ServerlessCacheArgs;
 * import com.pulumi.aws.elasticache.inputs.ServerlessCacheCacheUsageLimitsArgs;
 * import com.pulumi.aws.elasticache.inputs.ServerlessCacheCacheUsageLimitsDataStorageArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var example = new ServerlessCache("example", ServerlessCacheArgs.builder()
 *             .engine("redis")
 *             .name("example")
 *             .cacheUsageLimits(ServerlessCacheCacheUsageLimitsArgs.builder()
 *                 .dataStorage(ServerlessCacheCacheUsageLimitsDataStorageArgs.builder()
 *                     .maximum(10)
 *                     .unit("GB")
 *                     .build())
 *                 .ecpuPerSeconds(ServerlessCacheCacheUsageLimitsEcpuPerSecondArgs.builder()
 *                     .maximum(5000)
 *                     .build())
 *                 .build())
 *             .dailySnapshotTime("09:00")
 *             .description("Test Server")
 *             .kmsKeyId(test.arn())
 *             .majorEngineVersion("7")
 *             .snapshotRetentionLimit(1)
 *             .securityGroupIds(testAwsSecurityGroup.id())
 *             .subnetIds(testAwsSubnet.stream().map(element -> element.id()).collect(toList()))
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * Using `pulumi import`, import ElastiCache Serverless Cache using the `name`. For example:
 * 
 * ```sh
 * $ pulumi import aws:elasticache/serverlessCache:ServerlessCache my_cluster my_cluster
 * ```
 * 
 */
@ResourceType(type="aws:elasticache/serverlessCache:ServerlessCache")
public class ServerlessCache extends com.pulumi.resources.CustomResource {
    /**
     * The Amazon Resource Name (ARN) of the serverless cache.
     * 
     */
    @Export(name="arn", refs={String.class}, tree="[0]")
    private Output<String> arn;

    /**
     * @return The Amazon Resource Name (ARN) of the serverless cache.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * Sets the cache usage limits for storage and ElastiCache Processing Units for the cache. See configuration below.
     * 
     */
    @Export(name="cacheUsageLimits", refs={ServerlessCacheCacheUsageLimits.class}, tree="[0]")
    private Output</* @Nullable */ ServerlessCacheCacheUsageLimits> cacheUsageLimits;

    /**
     * @return Sets the cache usage limits for storage and ElastiCache Processing Units for the cache. See configuration below.
     * 
     */
    public Output<Optional<ServerlessCacheCacheUsageLimits>> cacheUsageLimits() {
        return Codegen.optional(this.cacheUsageLimits);
    }
    /**
     * Timestamp of when the serverless cache was created.
     * 
     */
    @Export(name="createTime", refs={String.class}, tree="[0]")
    private Output<String> createTime;

    /**
     * @return Timestamp of when the serverless cache was created.
     * 
     */
    public Output<String> createTime() {
        return this.createTime;
    }
    /**
     * The daily time that snapshots will be created from the new serverless cache. Only supported for engine type `&#34;redis&#34;`. Defaults to `0`.
     * 
     */
    @Export(name="dailySnapshotTime", refs={String.class}, tree="[0]")
    private Output<String> dailySnapshotTime;

    /**
     * @return The daily time that snapshots will be created from the new serverless cache. Only supported for engine type `&#34;redis&#34;`. Defaults to `0`.
     * 
     */
    public Output<String> dailySnapshotTime() {
        return this.dailySnapshotTime;
    }
    /**
     * User-provided description for the serverless cache. The default is NULL.
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output<String> description;

    /**
     * @return User-provided description for the serverless cache. The default is NULL.
     * 
     */
    public Output<String> description() {
        return this.description;
    }
    /**
     * Represents the information required for client programs to connect to a cache node. See config below for details.
     * 
     */
    @Export(name="endpoints", refs={List.class,ServerlessCacheEndpoint.class}, tree="[0,1]")
    private Output<List<ServerlessCacheEndpoint>> endpoints;

    /**
     * @return Represents the information required for client programs to connect to a cache node. See config below for details.
     * 
     */
    public Output<List<ServerlessCacheEndpoint>> endpoints() {
        return this.endpoints;
    }
    /**
     * Name of the cache engine to be used for this cache cluster. Valid values are `memcached` or `redis`.
     * 
     */
    @Export(name="engine", refs={String.class}, tree="[0]")
    private Output<String> engine;

    /**
     * @return Name of the cache engine to be used for this cache cluster. Valid values are `memcached` or `redis`.
     * 
     */
    public Output<String> engine() {
        return this.engine;
    }
    /**
     * The name and version number of the engine the serverless cache is compatible with.
     * 
     */
    @Export(name="fullEngineVersion", refs={String.class}, tree="[0]")
    private Output<String> fullEngineVersion;

    /**
     * @return The name and version number of the engine the serverless cache is compatible with.
     * 
     */
    public Output<String> fullEngineVersion() {
        return this.fullEngineVersion;
    }
    /**
     * ARN of the customer managed key for encrypting the data at rest. If no KMS key is provided, a default service key is used.
     * 
     */
    @Export(name="kmsKeyId", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> kmsKeyId;

    /**
     * @return ARN of the customer managed key for encrypting the data at rest. If no KMS key is provided, a default service key is used.
     * 
     */
    public Output<Optional<String>> kmsKeyId() {
        return Codegen.optional(this.kmsKeyId);
    }
    /**
     * The version of the cache engine that will be used to create the serverless cache.
     * See [Describe Cache Engine Versions](https://docs.aws.amazon.com/cli/latest/reference/elasticache/describe-cache-engine-versions.html) in the AWS Documentation for supported versions.
     * 
     */
    @Export(name="majorEngineVersion", refs={String.class}, tree="[0]")
    private Output<String> majorEngineVersion;

    /**
     * @return The version of the cache engine that will be used to create the serverless cache.
     * See [Describe Cache Engine Versions](https://docs.aws.amazon.com/cli/latest/reference/elasticache/describe-cache-engine-versions.html) in the AWS Documentation for supported versions.
     * 
     */
    public Output<String> majorEngineVersion() {
        return this.majorEngineVersion;
    }
    /**
     * The Cluster name which serves as a unique identifier to the serverless cache
     * 
     * The following arguments are optional:
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The Cluster name which serves as a unique identifier to the serverless cache
     * 
     * The following arguments are optional:
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Represents the information required for client programs to connect to a cache node. See config below for details.
     * 
     */
    @Export(name="readerEndpoints", refs={List.class,ServerlessCacheReaderEndpoint.class}, tree="[0,1]")
    private Output<List<ServerlessCacheReaderEndpoint>> readerEndpoints;

    /**
     * @return Represents the information required for client programs to connect to a cache node. See config below for details.
     * 
     */
    public Output<List<ServerlessCacheReaderEndpoint>> readerEndpoints() {
        return this.readerEndpoints;
    }
    /**
     * A list of the one or more VPC security groups to be associated with the serverless cache. The security group will authorize traffic access for the VPC end-point (private-link). If no other information is given this will be the VPC’s Default Security Group that is associated with the cluster VPC end-point.
     * 
     */
    @Export(name="securityGroupIds", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> securityGroupIds;

    /**
     * @return A list of the one or more VPC security groups to be associated with the serverless cache. The security group will authorize traffic access for the VPC end-point (private-link). If no other information is given this will be the VPC’s Default Security Group that is associated with the cluster VPC end-point.
     * 
     */
    public Output<List<String>> securityGroupIds() {
        return this.securityGroupIds;
    }
    /**
     * The list of ARN(s) of the snapshot that the new serverless cache will be created from. Available for Redis only.
     * 
     */
    @Export(name="snapshotArnsToRestores", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> snapshotArnsToRestores;

    /**
     * @return The list of ARN(s) of the snapshot that the new serverless cache will be created from. Available for Redis only.
     * 
     */
    public Output<Optional<List<String>>> snapshotArnsToRestores() {
        return Codegen.optional(this.snapshotArnsToRestores);
    }
    /**
     * The number of snapshots that will be retained for the serverless cache that is being created. As new snapshots beyond this limit are added, the oldest snapshots will be deleted on a rolling basis. Available for Redis only.
     * 
     */
    @Export(name="snapshotRetentionLimit", refs={Integer.class}, tree="[0]")
    private Output<Integer> snapshotRetentionLimit;

    /**
     * @return The number of snapshots that will be retained for the serverless cache that is being created. As new snapshots beyond this limit are added, the oldest snapshots will be deleted on a rolling basis. Available for Redis only.
     * 
     */
    public Output<Integer> snapshotRetentionLimit() {
        return this.snapshotRetentionLimit;
    }
    /**
     * The current status of the serverless cache. The allowed values are CREATING, AVAILABLE, DELETING, CREATE-FAILED and MODIFYING.
     * 
     */
    @Export(name="status", refs={String.class}, tree="[0]")
    private Output<String> status;

    /**
     * @return The current status of the serverless cache. The allowed values are CREATING, AVAILABLE, DELETING, CREATE-FAILED and MODIFYING.
     * 
     */
    public Output<String> status() {
        return this.status;
    }
    /**
     * A list of the identifiers of the subnets where the VPC endpoint for the serverless cache will be deployed. All the subnetIds must belong to the same VPC.
     * 
     */
    @Export(name="subnetIds", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> subnetIds;

    /**
     * @return A list of the identifiers of the subnets where the VPC endpoint for the serverless cache will be deployed. All the subnetIds must belong to the same VPC.
     * 
     */
    public Output<List<String>> subnetIds() {
        return this.subnetIds;
    }
    /**
     * Map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Export(name="tags", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * @deprecated
     * Please use `tags` instead.
     * 
     */
    @Deprecated /* Please use `tags` instead. */
    @Export(name="tagsAll", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output<Map<String,String>> tagsAll;

    public Output<Map<String,String>> tagsAll() {
        return this.tagsAll;
    }
    @Export(name="timeouts", refs={ServerlessCacheTimeouts.class}, tree="[0]")
    private Output</* @Nullable */ ServerlessCacheTimeouts> timeouts;

    public Output<Optional<ServerlessCacheTimeouts>> timeouts() {
        return Codegen.optional(this.timeouts);
    }
    /**
     * The identifier of the UserGroup to be associated with the serverless cache. Available for Redis only. Default is NULL.
     * 
     */
    @Export(name="userGroupId", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> userGroupId;

    /**
     * @return The identifier of the UserGroup to be associated with the serverless cache. Available for Redis only. Default is NULL.
     * 
     */
    public Output<Optional<String>> userGroupId() {
        return Codegen.optional(this.userGroupId);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ServerlessCache(String name) {
        this(name, ServerlessCacheArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ServerlessCache(String name, ServerlessCacheArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ServerlessCache(String name, ServerlessCacheArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:elasticache/serverlessCache:ServerlessCache", name, args == null ? ServerlessCacheArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ServerlessCache(String name, Output<String> id, @Nullable ServerlessCacheState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:elasticache/serverlessCache:ServerlessCache", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static ServerlessCache get(String name, Output<String> id, @Nullable ServerlessCacheState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ServerlessCache(name, id, state, options);
    }
}
