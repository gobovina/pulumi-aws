// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.AutoScaling
{
    /// <summary>
    /// Provides an AutoScaling Group with Notification support, via SNS Topics. Each of
    /// the `notifications` map to a [Notification Configuration](https://docs.aws.amazon.com/AutoScaling/latest/APIReference/API_DescribeNotificationConfigurations.html) inside Amazon Web
    /// Services, and are applied to each AutoScaling Group you supply.
    /// 
    /// ## Example Usage
    /// 
    /// Basic usage:
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Aws = Pulumi.Aws;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var example = new Aws.Sns.Topic("example", new()
    ///     {
    ///         Name = "example-topic",
    ///     });
    /// 
    ///     var bar = new Aws.AutoScaling.Group("bar", new()
    ///     {
    ///         Name = "foobar1-test",
    ///     });
    /// 
    ///     var foo = new Aws.AutoScaling.Group("foo", new()
    ///     {
    ///         Name = "barfoo-test",
    ///     });
    /// 
    ///     var exampleNotifications = new Aws.AutoScaling.Notification("example_notifications", new()
    ///     {
    ///         GroupNames = new[]
    ///         {
    ///             bar.Name,
    ///             foo.Name,
    ///         },
    ///         Notifications = new[]
    ///         {
    ///             "autoscaling:EC2_INSTANCE_LAUNCH",
    ///             "autoscaling:EC2_INSTANCE_TERMINATE",
    ///             "autoscaling:EC2_INSTANCE_LAUNCH_ERROR",
    ///             "autoscaling:EC2_INSTANCE_TERMINATE_ERROR",
    ///         },
    ///         TopicArn = example.Arn,
    ///     });
    /// 
    /// });
    /// ```
    /// </summary>
    [AwsResourceType("aws:autoscaling/notification:Notification")]
    public partial class Notification : global::Pulumi.CustomResource
    {
        /// <summary>
        /// List of AutoScaling Group Names
        /// </summary>
        [Output("groupNames")]
        public Output<ImmutableArray<string>> GroupNames { get; private set; } = null!;

        /// <summary>
        /// List of Notification Types that trigger
        /// notifications. Acceptable values are documented [in the AWS documentation here](https://docs.aws.amazon.com/AutoScaling/latest/APIReference/API_NotificationConfiguration.html)
        /// </summary>
        [Output("notifications")]
        public Output<ImmutableArray<string>> Notifications { get; private set; } = null!;

        /// <summary>
        /// Topic ARN for notifications to be sent through
        /// </summary>
        [Output("topicArn")]
        public Output<string> TopicArn { get; private set; } = null!;


        /// <summary>
        /// Create a Notification resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Notification(string name, NotificationArgs args, CustomResourceOptions? options = null)
            : base("aws:autoscaling/notification:Notification", name, args ?? new NotificationArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Notification(string name, Input<string> id, NotificationState? state = null, CustomResourceOptions? options = null)
            : base("aws:autoscaling/notification:Notification", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing Notification resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Notification Get(string name, Input<string> id, NotificationState? state = null, CustomResourceOptions? options = null)
        {
            return new Notification(name, id, state, options);
        }
    }

    public sealed class NotificationArgs : global::Pulumi.ResourceArgs
    {
        [Input("groupNames", required: true)]
        private InputList<string>? _groupNames;

        /// <summary>
        /// List of AutoScaling Group Names
        /// </summary>
        public InputList<string> GroupNames
        {
            get => _groupNames ?? (_groupNames = new InputList<string>());
            set => _groupNames = value;
        }

        [Input("notifications", required: true)]
        private InputList<string>? _notifications;

        /// <summary>
        /// List of Notification Types that trigger
        /// notifications. Acceptable values are documented [in the AWS documentation here](https://docs.aws.amazon.com/AutoScaling/latest/APIReference/API_NotificationConfiguration.html)
        /// </summary>
        public InputList<string> Notifications
        {
            get => _notifications ?? (_notifications = new InputList<string>());
            set => _notifications = value;
        }

        /// <summary>
        /// Topic ARN for notifications to be sent through
        /// </summary>
        [Input("topicArn", required: true)]
        public Input<string> TopicArn { get; set; } = null!;

        public NotificationArgs()
        {
        }
        public static new NotificationArgs Empty => new NotificationArgs();
    }

    public sealed class NotificationState : global::Pulumi.ResourceArgs
    {
        [Input("groupNames")]
        private InputList<string>? _groupNames;

        /// <summary>
        /// List of AutoScaling Group Names
        /// </summary>
        public InputList<string> GroupNames
        {
            get => _groupNames ?? (_groupNames = new InputList<string>());
            set => _groupNames = value;
        }

        [Input("notifications")]
        private InputList<string>? _notifications;

        /// <summary>
        /// List of Notification Types that trigger
        /// notifications. Acceptable values are documented [in the AWS documentation here](https://docs.aws.amazon.com/AutoScaling/latest/APIReference/API_NotificationConfiguration.html)
        /// </summary>
        public InputList<string> Notifications
        {
            get => _notifications ?? (_notifications = new InputList<string>());
            set => _notifications = value;
        }

        /// <summary>
        /// Topic ARN for notifications to be sent through
        /// </summary>
        [Input("topicArn")]
        public Input<string>? TopicArn { get; set; }

        public NotificationState()
        {
        }
        public static new NotificationState Empty => new NotificationState();
    }
}
