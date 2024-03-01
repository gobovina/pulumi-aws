// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.ElastiCache
{
    /// <summary>
    /// Provides an ElastiCache Serverless Cache resource which manages memcached or redis.
    /// 
    /// ## Example Usage
    /// ### Memcached Serverless
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Aws = Pulumi.Aws;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var example = new Aws.ElastiCache.ServerlessCache("example", new()
    ///     {
    ///         Engine = "memcached",
    ///         Name = "example",
    ///         CacheUsageLimits = new Aws.ElastiCache.Inputs.ServerlessCacheCacheUsageLimitsArgs
    ///         {
    ///             DataStorage = new Aws.ElastiCache.Inputs.ServerlessCacheCacheUsageLimitsDataStorageArgs
    ///             {
    ///                 Maximum = 10,
    ///                 Unit = "GB",
    ///             },
    ///             EcpuPerSeconds = new[]
    ///             {
    ///                 new Aws.ElastiCache.Inputs.ServerlessCacheCacheUsageLimitsEcpuPerSecondArgs
    ///                 {
    ///                     Maximum = 5,
    ///                 },
    ///             },
    ///         },
    ///         Description = "Test Server",
    ///         KmsKeyId = test.Arn,
    ///         MajorEngineVersion = "1.6",
    ///         SecurityGroupIds = new[]
    ///         {
    ///             testAwsSecurityGroup.Id,
    ///         },
    ///         SubnetIds = testAwsSubnet.Select(__item =&gt; __item.Id).ToList(),
    ///     });
    /// 
    /// });
    /// ```
    /// ### Redis Serverless
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Aws = Pulumi.Aws;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var example = new Aws.ElastiCache.ServerlessCache("example", new()
    ///     {
    ///         Engine = "redis",
    ///         Name = "example",
    ///         CacheUsageLimits = new Aws.ElastiCache.Inputs.ServerlessCacheCacheUsageLimitsArgs
    ///         {
    ///             DataStorage = new Aws.ElastiCache.Inputs.ServerlessCacheCacheUsageLimitsDataStorageArgs
    ///             {
    ///                 Maximum = 10,
    ///                 Unit = "GB",
    ///             },
    ///             EcpuPerSeconds = new[]
    ///             {
    ///                 new Aws.ElastiCache.Inputs.ServerlessCacheCacheUsageLimitsEcpuPerSecondArgs
    ///                 {
    ///                     Maximum = 5,
    ///                 },
    ///             },
    ///         },
    ///         DailySnapshotTime = "09:00",
    ///         Description = "Test Server",
    ///         KmsKeyId = test.Arn,
    ///         MajorEngineVersion = "7",
    ///         SnapshotRetentionLimit = 1,
    ///         SecurityGroupIds = new[]
    ///         {
    ///             testAwsSecurityGroup.Id,
    ///         },
    ///         SubnetIds = testAwsSubnet.Select(__item =&gt; __item.Id).ToList(),
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Using `pulumi import`, import ElastiCache Serverless Cache using the `name`. For example:
    /// 
    /// ```sh
    ///  $ pulumi import aws:elasticache/serverlessCache:ServerlessCache my_cluster my_cluster
    /// ```
    /// </summary>
    [AwsResourceType("aws:elasticache/serverlessCache:ServerlessCache")]
    public partial class ServerlessCache : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The Amazon Resource Name (ARN) of the serverless cache.
        /// </summary>
        [Output("arn")]
        public Output<string> Arn { get; private set; } = null!;

        /// <summary>
        /// Sets the cache usage limits for storage and ElastiCache Processing Units for the cache. See configuration below.
        /// </summary>
        [Output("cacheUsageLimits")]
        public Output<Outputs.ServerlessCacheCacheUsageLimits?> CacheUsageLimits { get; private set; } = null!;

        /// <summary>
        /// Timestamp of when the serverless cache was created.
        /// </summary>
        [Output("createTime")]
        public Output<string> CreateTime { get; private set; } = null!;

        /// <summary>
        /// The daily time that snapshots will be created from the new serverless cache. Only supported for engine type `"redis"`. Defaults to `0`.
        /// </summary>
        [Output("dailySnapshotTime")]
        public Output<string> DailySnapshotTime { get; private set; } = null!;

        /// <summary>
        /// User-provided description for the serverless cache. The default is NULL.
        /// </summary>
        [Output("description")]
        public Output<string> Description { get; private set; } = null!;

        /// <summary>
        /// Represents the information required for client programs to connect to a cache node. See config below for details.
        /// </summary>
        [Output("endpoints")]
        public Output<ImmutableArray<Outputs.ServerlessCacheEndpoint>> Endpoints { get; private set; } = null!;

        /// <summary>
        /// Name of the cache engine to be used for this cache cluster. Valid values are `memcached` or `redis`.
        /// </summary>
        [Output("engine")]
        public Output<string> Engine { get; private set; } = null!;

        /// <summary>
        /// The name and version number of the engine the serverless cache is compatible with.
        /// </summary>
        [Output("fullEngineVersion")]
        public Output<string> FullEngineVersion { get; private set; } = null!;

        /// <summary>
        /// ARN of the customer managed key for encrypting the data at rest. If no KMS key is provided, a default service key is used.
        /// </summary>
        [Output("kmsKeyId")]
        public Output<string?> KmsKeyId { get; private set; } = null!;

        /// <summary>
        /// The version of the cache engine that will be used to create the serverless cache.
        /// See [Describe Cache Engine Versions](https://docs.aws.amazon.com/cli/latest/reference/elasticache/describe-cache-engine-versions.html) in the AWS Documentation for supported versions.
        /// </summary>
        [Output("majorEngineVersion")]
        public Output<string> MajorEngineVersion { get; private set; } = null!;

        /// <summary>
        /// The Cluster name which serves as a unique identifier to the serverless cache
        /// 
        /// The following arguments are optional:
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// Represents the information required for client programs to connect to a cache node. See config below for details.
        /// </summary>
        [Output("readerEndpoints")]
        public Output<ImmutableArray<Outputs.ServerlessCacheReaderEndpoint>> ReaderEndpoints { get; private set; } = null!;

        /// <summary>
        /// A list of the one or more VPC security groups to be associated with the serverless cache. The security group will authorize traffic access for the VPC end-point (private-link). If no other information is given this will be the VPC’s Default Security Group that is associated with the cluster VPC end-point.
        /// </summary>
        [Output("securityGroupIds")]
        public Output<ImmutableArray<string>> SecurityGroupIds { get; private set; } = null!;

        /// <summary>
        /// The list of ARN(s) of the snapshot that the new serverless cache will be created from. Available for Redis only.
        /// </summary>
        [Output("snapshotArnsToRestores")]
        public Output<ImmutableArray<string>> SnapshotArnsToRestores { get; private set; } = null!;

        /// <summary>
        /// The number of snapshots that will be retained for the serverless cache that is being created. As new snapshots beyond this limit are added, the oldest snapshots will be deleted on a rolling basis. Available for Redis only.
        /// </summary>
        [Output("snapshotRetentionLimit")]
        public Output<int> SnapshotRetentionLimit { get; private set; } = null!;

        /// <summary>
        /// The current status of the serverless cache. The allowed values are CREATING, AVAILABLE, DELETING, CREATE-FAILED and MODIFYING.
        /// </summary>
        [Output("status")]
        public Output<string> Status { get; private set; } = null!;

        /// <summary>
        /// A list of the identifiers of the subnets where the VPC endpoint for the serverless cache will be deployed. All the subnetIds must belong to the same VPC.
        /// </summary>
        [Output("subnetIds")]
        public Output<ImmutableArray<string>> SubnetIds { get; private set; } = null!;

        /// <summary>
        /// Map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        /// </summary>
        [Output("tags")]
        public Output<ImmutableDictionary<string, string>?> Tags { get; private set; } = null!;

        [Output("tagsAll")]
        public Output<ImmutableDictionary<string, string>> TagsAll { get; private set; } = null!;

        [Output("timeouts")]
        public Output<Outputs.ServerlessCacheTimeouts?> Timeouts { get; private set; } = null!;

        /// <summary>
        /// The identifier of the UserGroup to be associated with the serverless cache. Available for Redis only. Default is NULL.
        /// </summary>
        [Output("userGroupId")]
        public Output<string?> UserGroupId { get; private set; } = null!;


        /// <summary>
        /// Create a ServerlessCache resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public ServerlessCache(string name, ServerlessCacheArgs args, CustomResourceOptions? options = null)
            : base("aws:elasticache/serverlessCache:ServerlessCache", name, args ?? new ServerlessCacheArgs(), MakeResourceOptions(options, ""))
        {
        }

        private ServerlessCache(string name, Input<string> id, ServerlessCacheState? state = null, CustomResourceOptions? options = null)
            : base("aws:elasticache/serverlessCache:ServerlessCache", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing ServerlessCache resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static ServerlessCache Get(string name, Input<string> id, ServerlessCacheState? state = null, CustomResourceOptions? options = null)
        {
            return new ServerlessCache(name, id, state, options);
        }
    }

    public sealed class ServerlessCacheArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Sets the cache usage limits for storage and ElastiCache Processing Units for the cache. See configuration below.
        /// </summary>
        [Input("cacheUsageLimits")]
        public Input<Inputs.ServerlessCacheCacheUsageLimitsArgs>? CacheUsageLimits { get; set; }

        /// <summary>
        /// The daily time that snapshots will be created from the new serverless cache. Only supported for engine type `"redis"`. Defaults to `0`.
        /// </summary>
        [Input("dailySnapshotTime")]
        public Input<string>? DailySnapshotTime { get; set; }

        /// <summary>
        /// User-provided description for the serverless cache. The default is NULL.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// Name of the cache engine to be used for this cache cluster. Valid values are `memcached` or `redis`.
        /// </summary>
        [Input("engine", required: true)]
        public Input<string> Engine { get; set; } = null!;

        /// <summary>
        /// ARN of the customer managed key for encrypting the data at rest. If no KMS key is provided, a default service key is used.
        /// </summary>
        [Input("kmsKeyId")]
        public Input<string>? KmsKeyId { get; set; }

        /// <summary>
        /// The version of the cache engine that will be used to create the serverless cache.
        /// See [Describe Cache Engine Versions](https://docs.aws.amazon.com/cli/latest/reference/elasticache/describe-cache-engine-versions.html) in the AWS Documentation for supported versions.
        /// </summary>
        [Input("majorEngineVersion")]
        public Input<string>? MajorEngineVersion { get; set; }

        /// <summary>
        /// The Cluster name which serves as a unique identifier to the serverless cache
        /// 
        /// The following arguments are optional:
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("securityGroupIds")]
        private InputList<string>? _securityGroupIds;

        /// <summary>
        /// A list of the one or more VPC security groups to be associated with the serverless cache. The security group will authorize traffic access for the VPC end-point (private-link). If no other information is given this will be the VPC’s Default Security Group that is associated with the cluster VPC end-point.
        /// </summary>
        public InputList<string> SecurityGroupIds
        {
            get => _securityGroupIds ?? (_securityGroupIds = new InputList<string>());
            set => _securityGroupIds = value;
        }

        [Input("snapshotArnsToRestores")]
        private InputList<string>? _snapshotArnsToRestores;

        /// <summary>
        /// The list of ARN(s) of the snapshot that the new serverless cache will be created from. Available for Redis only.
        /// </summary>
        public InputList<string> SnapshotArnsToRestores
        {
            get => _snapshotArnsToRestores ?? (_snapshotArnsToRestores = new InputList<string>());
            set => _snapshotArnsToRestores = value;
        }

        /// <summary>
        /// The number of snapshots that will be retained for the serverless cache that is being created. As new snapshots beyond this limit are added, the oldest snapshots will be deleted on a rolling basis. Available for Redis only.
        /// </summary>
        [Input("snapshotRetentionLimit")]
        public Input<int>? SnapshotRetentionLimit { get; set; }

        [Input("subnetIds")]
        private InputList<string>? _subnetIds;

        /// <summary>
        /// A list of the identifiers of the subnets where the VPC endpoint for the serverless cache will be deployed. All the subnetIds must belong to the same VPC.
        /// </summary>
        public InputList<string> SubnetIds
        {
            get => _subnetIds ?? (_subnetIds = new InputList<string>());
            set => _subnetIds = value;
        }

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// Map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        /// </summary>
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        [Input("timeouts")]
        public Input<Inputs.ServerlessCacheTimeoutsArgs>? Timeouts { get; set; }

        /// <summary>
        /// The identifier of the UserGroup to be associated with the serverless cache. Available for Redis only. Default is NULL.
        /// </summary>
        [Input("userGroupId")]
        public Input<string>? UserGroupId { get; set; }

        public ServerlessCacheArgs()
        {
        }
        public static new ServerlessCacheArgs Empty => new ServerlessCacheArgs();
    }

    public sealed class ServerlessCacheState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The Amazon Resource Name (ARN) of the serverless cache.
        /// </summary>
        [Input("arn")]
        public Input<string>? Arn { get; set; }

        /// <summary>
        /// Sets the cache usage limits for storage and ElastiCache Processing Units for the cache. See configuration below.
        /// </summary>
        [Input("cacheUsageLimits")]
        public Input<Inputs.ServerlessCacheCacheUsageLimitsGetArgs>? CacheUsageLimits { get; set; }

        /// <summary>
        /// Timestamp of when the serverless cache was created.
        /// </summary>
        [Input("createTime")]
        public Input<string>? CreateTime { get; set; }

        /// <summary>
        /// The daily time that snapshots will be created from the new serverless cache. Only supported for engine type `"redis"`. Defaults to `0`.
        /// </summary>
        [Input("dailySnapshotTime")]
        public Input<string>? DailySnapshotTime { get; set; }

        /// <summary>
        /// User-provided description for the serverless cache. The default is NULL.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        [Input("endpoints")]
        private InputList<Inputs.ServerlessCacheEndpointGetArgs>? _endpoints;

        /// <summary>
        /// Represents the information required for client programs to connect to a cache node. See config below for details.
        /// </summary>
        public InputList<Inputs.ServerlessCacheEndpointGetArgs> Endpoints
        {
            get => _endpoints ?? (_endpoints = new InputList<Inputs.ServerlessCacheEndpointGetArgs>());
            set => _endpoints = value;
        }

        /// <summary>
        /// Name of the cache engine to be used for this cache cluster. Valid values are `memcached` or `redis`.
        /// </summary>
        [Input("engine")]
        public Input<string>? Engine { get; set; }

        /// <summary>
        /// The name and version number of the engine the serverless cache is compatible with.
        /// </summary>
        [Input("fullEngineVersion")]
        public Input<string>? FullEngineVersion { get; set; }

        /// <summary>
        /// ARN of the customer managed key for encrypting the data at rest. If no KMS key is provided, a default service key is used.
        /// </summary>
        [Input("kmsKeyId")]
        public Input<string>? KmsKeyId { get; set; }

        /// <summary>
        /// The version of the cache engine that will be used to create the serverless cache.
        /// See [Describe Cache Engine Versions](https://docs.aws.amazon.com/cli/latest/reference/elasticache/describe-cache-engine-versions.html) in the AWS Documentation for supported versions.
        /// </summary>
        [Input("majorEngineVersion")]
        public Input<string>? MajorEngineVersion { get; set; }

        /// <summary>
        /// The Cluster name which serves as a unique identifier to the serverless cache
        /// 
        /// The following arguments are optional:
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("readerEndpoints")]
        private InputList<Inputs.ServerlessCacheReaderEndpointGetArgs>? _readerEndpoints;

        /// <summary>
        /// Represents the information required for client programs to connect to a cache node. See config below for details.
        /// </summary>
        public InputList<Inputs.ServerlessCacheReaderEndpointGetArgs> ReaderEndpoints
        {
            get => _readerEndpoints ?? (_readerEndpoints = new InputList<Inputs.ServerlessCacheReaderEndpointGetArgs>());
            set => _readerEndpoints = value;
        }

        [Input("securityGroupIds")]
        private InputList<string>? _securityGroupIds;

        /// <summary>
        /// A list of the one or more VPC security groups to be associated with the serverless cache. The security group will authorize traffic access for the VPC end-point (private-link). If no other information is given this will be the VPC’s Default Security Group that is associated with the cluster VPC end-point.
        /// </summary>
        public InputList<string> SecurityGroupIds
        {
            get => _securityGroupIds ?? (_securityGroupIds = new InputList<string>());
            set => _securityGroupIds = value;
        }

        [Input("snapshotArnsToRestores")]
        private InputList<string>? _snapshotArnsToRestores;

        /// <summary>
        /// The list of ARN(s) of the snapshot that the new serverless cache will be created from. Available for Redis only.
        /// </summary>
        public InputList<string> SnapshotArnsToRestores
        {
            get => _snapshotArnsToRestores ?? (_snapshotArnsToRestores = new InputList<string>());
            set => _snapshotArnsToRestores = value;
        }

        /// <summary>
        /// The number of snapshots that will be retained for the serverless cache that is being created. As new snapshots beyond this limit are added, the oldest snapshots will be deleted on a rolling basis. Available for Redis only.
        /// </summary>
        [Input("snapshotRetentionLimit")]
        public Input<int>? SnapshotRetentionLimit { get; set; }

        /// <summary>
        /// The current status of the serverless cache. The allowed values are CREATING, AVAILABLE, DELETING, CREATE-FAILED and MODIFYING.
        /// </summary>
        [Input("status")]
        public Input<string>? Status { get; set; }

        [Input("subnetIds")]
        private InputList<string>? _subnetIds;

        /// <summary>
        /// A list of the identifiers of the subnets where the VPC endpoint for the serverless cache will be deployed. All the subnetIds must belong to the same VPC.
        /// </summary>
        public InputList<string> SubnetIds
        {
            get => _subnetIds ?? (_subnetIds = new InputList<string>());
            set => _subnetIds = value;
        }

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// Map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        /// </summary>
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        [Input("tagsAll")]
        private InputMap<string>? _tagsAll;
        [Obsolete(@"Please use `tags` instead.")]
        public InputMap<string> TagsAll
        {
            get => _tagsAll ?? (_tagsAll = new InputMap<string>());
            set => _tagsAll = value;
        }

        [Input("timeouts")]
        public Input<Inputs.ServerlessCacheTimeoutsGetArgs>? Timeouts { get; set; }

        /// <summary>
        /// The identifier of the UserGroup to be associated with the serverless cache. Available for Redis only. Default is NULL.
        /// </summary>
        [Input("userGroupId")]
        public Input<string>? UserGroupId { get; set; }

        public ServerlessCacheState()
        {
        }
        public static new ServerlessCacheState Empty => new ServerlessCacheState();
    }
}
