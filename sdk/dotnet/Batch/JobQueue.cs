// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Batch
{
    /// <summary>
    /// Provides a Batch Job Queue resource.
    /// 
    /// ## Example Usage
    /// 
    /// ### Basic Job Queue
    /// 
    /// &lt;!--Start PulumiCodeChooser --&gt;
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Aws = Pulumi.Aws;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var testQueue = new Aws.Batch.JobQueue("test_queue", new()
    ///     {
    ///         Name = "tf-test-batch-job-queue",
    ///         State = "ENABLED",
    ///         Priority = 1,
    ///         ComputeEnvironments = new[]
    ///         {
    ///             testEnvironment1.Arn,
    ///             testEnvironment2.Arn,
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// &lt;!--End PulumiCodeChooser --&gt;
    /// 
    /// ### Job Queue with a fair share scheduling policy
    /// 
    /// &lt;!--Start PulumiCodeChooser --&gt;
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Aws = Pulumi.Aws;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var example = new Aws.Batch.SchedulingPolicy("example", new()
    ///     {
    ///         Name = "example",
    ///         FairSharePolicy = new Aws.Batch.Inputs.SchedulingPolicyFairSharePolicyArgs
    ///         {
    ///             ComputeReservation = 1,
    ///             ShareDecaySeconds = 3600,
    ///             ShareDistributions = new[]
    ///             {
    ///                 new Aws.Batch.Inputs.SchedulingPolicyFairSharePolicyShareDistributionArgs
    ///                 {
    ///                     ShareIdentifier = "A1*",
    ///                     WeightFactor = 0.1,
    ///                 },
    ///             },
    ///         },
    ///     });
    /// 
    ///     var exampleJobQueue = new Aws.Batch.JobQueue("example", new()
    ///     {
    ///         Name = "tf-test-batch-job-queue",
    ///         SchedulingPolicyArn = example.Arn,
    ///         State = "ENABLED",
    ///         Priority = 1,
    ///         ComputeEnvironments = new[]
    ///         {
    ///             testEnvironment1.Arn,
    ///             testEnvironment2.Arn,
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// &lt;!--End PulumiCodeChooser --&gt;
    /// 
    /// ## Import
    /// 
    /// Using `pulumi import`, import Batch Job Queue using the `arn`. For example:
    /// 
    /// ```sh
    /// $ pulumi import aws:batch/jobQueue:JobQueue test_queue arn:aws:batch:us-east-1:123456789012:job-queue/sample
    /// ```
    /// </summary>
    [AwsResourceType("aws:batch/jobQueue:JobQueue")]
    public partial class JobQueue : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The Amazon Resource Name of the job queue.
        /// </summary>
        [Output("arn")]
        public Output<string> Arn { get; private set; } = null!;

        /// <summary>
        /// List of compute environment ARNs mapped to a job queue.
        /// The position of the compute environments in the list will dictate the order.
        /// </summary>
        [Output("computeEnvironments")]
        public Output<ImmutableArray<string>> ComputeEnvironments { get; private set; } = null!;

        /// <summary>
        /// Specifies the name of the job queue.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// The priority of the job queue. Job queues with a higher priority
        /// are evaluated first when associated with the same compute environment.
        /// </summary>
        [Output("priority")]
        public Output<int> Priority { get; private set; } = null!;

        /// <summary>
        /// The ARN of the fair share scheduling policy. If this parameter is specified, the job queue uses a fair share scheduling policy. If this parameter isn't specified, the job queue uses a first in, first out (FIFO) scheduling policy. After a job queue is created, you can replace but can't remove the fair share scheduling policy.
        /// </summary>
        [Output("schedulingPolicyArn")]
        public Output<string?> SchedulingPolicyArn { get; private set; } = null!;

        /// <summary>
        /// The state of the job queue. Must be one of: `ENABLED` or `DISABLED`
        /// </summary>
        [Output("state")]
        public Output<string> State { get; private set; } = null!;

        /// <summary>
        /// Key-value map of resource tags. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        /// </summary>
        [Output("tags")]
        public Output<ImmutableDictionary<string, string>?> Tags { get; private set; } = null!;

        /// <summary>
        /// A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        /// </summary>
        [Output("tagsAll")]
        public Output<ImmutableDictionary<string, string>> TagsAll { get; private set; } = null!;

        [Output("timeouts")]
        public Output<Outputs.JobQueueTimeouts?> Timeouts { get; private set; } = null!;


        /// <summary>
        /// Create a JobQueue resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public JobQueue(string name, JobQueueArgs args, CustomResourceOptions? options = null)
            : base("aws:batch/jobQueue:JobQueue", name, args ?? new JobQueueArgs(), MakeResourceOptions(options, ""))
        {
        }

        private JobQueue(string name, Input<string> id, JobQueueState? state = null, CustomResourceOptions? options = null)
            : base("aws:batch/jobQueue:JobQueue", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing JobQueue resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static JobQueue Get(string name, Input<string> id, JobQueueState? state = null, CustomResourceOptions? options = null)
        {
            return new JobQueue(name, id, state, options);
        }
    }

    public sealed class JobQueueArgs : global::Pulumi.ResourceArgs
    {
        [Input("computeEnvironments", required: true)]
        private InputList<string>? _computeEnvironments;

        /// <summary>
        /// List of compute environment ARNs mapped to a job queue.
        /// The position of the compute environments in the list will dictate the order.
        /// </summary>
        public InputList<string> ComputeEnvironments
        {
            get => _computeEnvironments ?? (_computeEnvironments = new InputList<string>());
            set => _computeEnvironments = value;
        }

        /// <summary>
        /// Specifies the name of the job queue.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The priority of the job queue. Job queues with a higher priority
        /// are evaluated first when associated with the same compute environment.
        /// </summary>
        [Input("priority", required: true)]
        public Input<int> Priority { get; set; } = null!;

        /// <summary>
        /// The ARN of the fair share scheduling policy. If this parameter is specified, the job queue uses a fair share scheduling policy. If this parameter isn't specified, the job queue uses a first in, first out (FIFO) scheduling policy. After a job queue is created, you can replace but can't remove the fair share scheduling policy.
        /// </summary>
        [Input("schedulingPolicyArn")]
        public Input<string>? SchedulingPolicyArn { get; set; }

        /// <summary>
        /// The state of the job queue. Must be one of: `ENABLED` or `DISABLED`
        /// </summary>
        [Input("state", required: true)]
        public Input<string> State { get; set; } = null!;

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// Key-value map of resource tags. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        /// </summary>
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        [Input("timeouts")]
        public Input<Inputs.JobQueueTimeoutsArgs>? Timeouts { get; set; }

        public JobQueueArgs()
        {
        }
        public static new JobQueueArgs Empty => new JobQueueArgs();
    }

    public sealed class JobQueueState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The Amazon Resource Name of the job queue.
        /// </summary>
        [Input("arn")]
        public Input<string>? Arn { get; set; }

        [Input("computeEnvironments")]
        private InputList<string>? _computeEnvironments;

        /// <summary>
        /// List of compute environment ARNs mapped to a job queue.
        /// The position of the compute environments in the list will dictate the order.
        /// </summary>
        public InputList<string> ComputeEnvironments
        {
            get => _computeEnvironments ?? (_computeEnvironments = new InputList<string>());
            set => _computeEnvironments = value;
        }

        /// <summary>
        /// Specifies the name of the job queue.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The priority of the job queue. Job queues with a higher priority
        /// are evaluated first when associated with the same compute environment.
        /// </summary>
        [Input("priority")]
        public Input<int>? Priority { get; set; }

        /// <summary>
        /// The ARN of the fair share scheduling policy. If this parameter is specified, the job queue uses a fair share scheduling policy. If this parameter isn't specified, the job queue uses a first in, first out (FIFO) scheduling policy. After a job queue is created, you can replace but can't remove the fair share scheduling policy.
        /// </summary>
        [Input("schedulingPolicyArn")]
        public Input<string>? SchedulingPolicyArn { get; set; }

        /// <summary>
        /// The state of the job queue. Must be one of: `ENABLED` or `DISABLED`
        /// </summary>
        [Input("state")]
        public Input<string>? State { get; set; }

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// Key-value map of resource tags. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        /// </summary>
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        [Input("tagsAll")]
        private InputMap<string>? _tagsAll;

        /// <summary>
        /// A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        /// </summary>
        [Obsolete(@"Please use `tags` instead.")]
        public InputMap<string> TagsAll
        {
            get => _tagsAll ?? (_tagsAll = new InputMap<string>());
            set => _tagsAll = value;
        }

        [Input("timeouts")]
        public Input<Inputs.JobQueueTimeoutsGetArgs>? Timeouts { get; set; }

        public JobQueueState()
        {
        }
        public static new JobQueueState Empty => new JobQueueState();
    }
}
