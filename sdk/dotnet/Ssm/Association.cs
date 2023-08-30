// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Ssm
{
    /// <summary>
    /// Associates an SSM Document to an instance or EC2 tag.
    /// 
    /// ## Example Usage
    /// ### Create an association for a specific instance
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Aws = Pulumi.Aws;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var example = new Aws.Ssm.Association("example", new()
    ///     {
    ///         Targets = new[]
    ///         {
    ///             new Aws.Ssm.Inputs.AssociationTargetArgs
    ///             {
    ///                 Key = "InstanceIds",
    ///                 Values = new[]
    ///                 {
    ///                     aws_instance.Example.Id,
    ///                 },
    ///             },
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// ### Create an association for all managed instances in an AWS account
    /// 
    /// To target all managed instances in an AWS account, set the `key` as `"InstanceIds"` with `values` set as `["*"]`. This example also illustrates how to use an Amazon owned SSM document named `AmazonCloudWatch-ManageAgent`.
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Aws = Pulumi.Aws;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var example = new Aws.Ssm.Association("example", new()
    ///     {
    ///         Targets = new[]
    ///         {
    ///             new Aws.Ssm.Inputs.AssociationTargetArgs
    ///             {
    ///                 Key = "InstanceIds",
    ///                 Values = new[]
    ///                 {
    ///                     "*",
    ///                 },
    ///             },
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// ### Create an association for a specific tag
    /// 
    /// This example shows how to target all managed instances that are assigned a tag key of `Environment` and value of `Development`.
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Aws = Pulumi.Aws;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var example = new Aws.Ssm.Association("example", new()
    ///     {
    ///         Targets = new[]
    ///         {
    ///             new Aws.Ssm.Inputs.AssociationTargetArgs
    ///             {
    ///                 Key = "tag:Environment",
    ///                 Values = new[]
    ///                 {
    ///                     "Development",
    ///                 },
    ///             },
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// ### Create an association with a specific schedule
    /// 
    /// This example shows how to schedule an association in various ways.
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Aws = Pulumi.Aws;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var example = new Aws.Ssm.Association("example", new()
    ///     {
    ///         ScheduleExpression = "cron(0 2 ? * SUN *)",
    ///         Targets = new[]
    ///         {
    ///             new Aws.Ssm.Inputs.AssociationTargetArgs
    ///             {
    ///                 Key = "InstanceIds",
    ///                 Values = new[]
    ///                 {
    ///                     aws_instance.Example.Id,
    ///                 },
    ///             },
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Using `pulumi import`, import SSM associations using the `association_id`. For example:
    /// 
    /// ```sh
    ///  $ pulumi import aws:ssm/association:Association test-association 10abcdef-0abc-1234-5678-90abcdef123456
    /// ```
    /// </summary>
    [AwsResourceType("aws:ssm/association:Association")]
    public partial class Association : global::Pulumi.CustomResource
    {
        /// <summary>
        /// By default, when you create a new or update associations, the system runs it immediately and then according to the schedule you specified. Enable this option if you do not want an association to run immediately after you create or update it. This parameter is not supported for rate expressions. Default: `false`.
        /// </summary>
        [Output("applyOnlyAtCronInterval")]
        public Output<bool?> ApplyOnlyAtCronInterval { get; private set; } = null!;

        /// <summary>
        /// The ARN of the SSM association
        /// </summary>
        [Output("arn")]
        public Output<string> Arn { get; private set; } = null!;

        /// <summary>
        /// The ID of the SSM association.
        /// </summary>
        [Output("associationId")]
        public Output<string> AssociationId { get; private set; } = null!;

        /// <summary>
        /// The descriptive name for the association.
        /// </summary>
        [Output("associationName")]
        public Output<string?> AssociationName { get; private set; } = null!;

        /// <summary>
        /// Specify the target for the association. This target is required for associations that use an `Automation` document and target resources by using rate controls. This should be set to the SSM document `parameter` that will define how your automation will branch out.
        /// </summary>
        [Output("automationTargetParameterName")]
        public Output<string?> AutomationTargetParameterName { get; private set; } = null!;

        /// <summary>
        /// The compliance severity for the association. Can be one of the following: `UNSPECIFIED`, `LOW`, `MEDIUM`, `HIGH` or `CRITICAL`
        /// </summary>
        [Output("complianceSeverity")]
        public Output<string?> ComplianceSeverity { get; private set; } = null!;

        /// <summary>
        /// The document version you want to associate with the target(s). Can be a specific version or the default version.
        /// </summary>
        [Output("documentVersion")]
        public Output<string> DocumentVersion { get; private set; } = null!;

        /// <summary>
        /// The instance ID to apply an SSM document to. Use `targets` with key `InstanceIds` for document schema versions 2.0 and above. Use the `targets` attribute instead.
        /// </summary>
        [Output("instanceId")]
        public Output<string?> InstanceId { get; private set; } = null!;

        /// <summary>
        /// The maximum number of targets allowed to run the association at the same time. You can specify a number, for example 10, or a percentage of the target set, for example 10%.
        /// </summary>
        [Output("maxConcurrency")]
        public Output<string?> MaxConcurrency { get; private set; } = null!;

        /// <summary>
        /// The number of errors that are allowed before the system stops sending requests to run the association on additional targets. You can specify a number, for example 10, or a percentage of the target set, for example 10%. If you specify a threshold of 3, the stop command is sent when the fourth error is returned. If you specify a threshold of 10% for 50 associations, the stop command is sent when the sixth error is returned.
        /// </summary>
        [Output("maxErrors")]
        public Output<string?> MaxErrors { get; private set; } = null!;

        /// <summary>
        /// The name of the SSM document to apply.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// An output location block. Output Location is documented below.
        /// </summary>
        [Output("outputLocation")]
        public Output<Outputs.AssociationOutputLocation?> OutputLocation { get; private set; } = null!;

        /// <summary>
        /// A block of arbitrary string parameters to pass to the SSM document.
        /// </summary>
        [Output("parameters")]
        public Output<ImmutableDictionary<string, string>> Parameters { get; private set; } = null!;

        /// <summary>
        /// A [cron or rate expression](https://docs.aws.amazon.com/systems-manager/latest/userguide/reference-cron-and-rate-expressions.html) that specifies when the association runs.
        /// </summary>
        [Output("scheduleExpression")]
        public Output<string?> ScheduleExpression { get; private set; } = null!;

        /// <summary>
        /// A block containing the targets of the SSM association. Targets are documented below. AWS currently supports a maximum of 5 targets.
        /// </summary>
        [Output("targets")]
        public Output<ImmutableArray<Outputs.AssociationTarget>> Targets { get; private set; } = null!;

        /// <summary>
        /// The number of seconds to wait for the association status to be `Success`. If `Success` status is not reached within the given time, create opration will fail.
        /// 
        /// Output Location (`output_location`) is an S3 bucket where you want to store the results of this association:
        /// </summary>
        [Output("waitForSuccessTimeoutSeconds")]
        public Output<int?> WaitForSuccessTimeoutSeconds { get; private set; } = null!;


        /// <summary>
        /// Create a Association resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Association(string name, AssociationArgs? args = null, CustomResourceOptions? options = null)
            : base("aws:ssm/association:Association", name, args ?? new AssociationArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Association(string name, Input<string> id, AssociationState? state = null, CustomResourceOptions? options = null)
            : base("aws:ssm/association:Association", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing Association resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Association Get(string name, Input<string> id, AssociationState? state = null, CustomResourceOptions? options = null)
        {
            return new Association(name, id, state, options);
        }
    }

    public sealed class AssociationArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// By default, when you create a new or update associations, the system runs it immediately and then according to the schedule you specified. Enable this option if you do not want an association to run immediately after you create or update it. This parameter is not supported for rate expressions. Default: `false`.
        /// </summary>
        [Input("applyOnlyAtCronInterval")]
        public Input<bool>? ApplyOnlyAtCronInterval { get; set; }

        /// <summary>
        /// The descriptive name for the association.
        /// </summary>
        [Input("associationName")]
        public Input<string>? AssociationName { get; set; }

        /// <summary>
        /// Specify the target for the association. This target is required for associations that use an `Automation` document and target resources by using rate controls. This should be set to the SSM document `parameter` that will define how your automation will branch out.
        /// </summary>
        [Input("automationTargetParameterName")]
        public Input<string>? AutomationTargetParameterName { get; set; }

        /// <summary>
        /// The compliance severity for the association. Can be one of the following: `UNSPECIFIED`, `LOW`, `MEDIUM`, `HIGH` or `CRITICAL`
        /// </summary>
        [Input("complianceSeverity")]
        public Input<string>? ComplianceSeverity { get; set; }

        /// <summary>
        /// The document version you want to associate with the target(s). Can be a specific version or the default version.
        /// </summary>
        [Input("documentVersion")]
        public Input<string>? DocumentVersion { get; set; }

        /// <summary>
        /// The instance ID to apply an SSM document to. Use `targets` with key `InstanceIds` for document schema versions 2.0 and above. Use the `targets` attribute instead.
        /// </summary>
        [Input("instanceId")]
        public Input<string>? InstanceId { get; set; }

        /// <summary>
        /// The maximum number of targets allowed to run the association at the same time. You can specify a number, for example 10, or a percentage of the target set, for example 10%.
        /// </summary>
        [Input("maxConcurrency")]
        public Input<string>? MaxConcurrency { get; set; }

        /// <summary>
        /// The number of errors that are allowed before the system stops sending requests to run the association on additional targets. You can specify a number, for example 10, or a percentage of the target set, for example 10%. If you specify a threshold of 3, the stop command is sent when the fourth error is returned. If you specify a threshold of 10% for 50 associations, the stop command is sent when the sixth error is returned.
        /// </summary>
        [Input("maxErrors")]
        public Input<string>? MaxErrors { get; set; }

        /// <summary>
        /// The name of the SSM document to apply.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// An output location block. Output Location is documented below.
        /// </summary>
        [Input("outputLocation")]
        public Input<Inputs.AssociationOutputLocationArgs>? OutputLocation { get; set; }

        [Input("parameters")]
        private InputMap<string>? _parameters;

        /// <summary>
        /// A block of arbitrary string parameters to pass to the SSM document.
        /// </summary>
        public InputMap<string> Parameters
        {
            get => _parameters ?? (_parameters = new InputMap<string>());
            set => _parameters = value;
        }

        /// <summary>
        /// A [cron or rate expression](https://docs.aws.amazon.com/systems-manager/latest/userguide/reference-cron-and-rate-expressions.html) that specifies when the association runs.
        /// </summary>
        [Input("scheduleExpression")]
        public Input<string>? ScheduleExpression { get; set; }

        [Input("targets")]
        private InputList<Inputs.AssociationTargetArgs>? _targets;

        /// <summary>
        /// A block containing the targets of the SSM association. Targets are documented below. AWS currently supports a maximum of 5 targets.
        /// </summary>
        public InputList<Inputs.AssociationTargetArgs> Targets
        {
            get => _targets ?? (_targets = new InputList<Inputs.AssociationTargetArgs>());
            set => _targets = value;
        }

        /// <summary>
        /// The number of seconds to wait for the association status to be `Success`. If `Success` status is not reached within the given time, create opration will fail.
        /// 
        /// Output Location (`output_location`) is an S3 bucket where you want to store the results of this association:
        /// </summary>
        [Input("waitForSuccessTimeoutSeconds")]
        public Input<int>? WaitForSuccessTimeoutSeconds { get; set; }

        public AssociationArgs()
        {
        }
        public static new AssociationArgs Empty => new AssociationArgs();
    }

    public sealed class AssociationState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// By default, when you create a new or update associations, the system runs it immediately and then according to the schedule you specified. Enable this option if you do not want an association to run immediately after you create or update it. This parameter is not supported for rate expressions. Default: `false`.
        /// </summary>
        [Input("applyOnlyAtCronInterval")]
        public Input<bool>? ApplyOnlyAtCronInterval { get; set; }

        /// <summary>
        /// The ARN of the SSM association
        /// </summary>
        [Input("arn")]
        public Input<string>? Arn { get; set; }

        /// <summary>
        /// The ID of the SSM association.
        /// </summary>
        [Input("associationId")]
        public Input<string>? AssociationId { get; set; }

        /// <summary>
        /// The descriptive name for the association.
        /// </summary>
        [Input("associationName")]
        public Input<string>? AssociationName { get; set; }

        /// <summary>
        /// Specify the target for the association. This target is required for associations that use an `Automation` document and target resources by using rate controls. This should be set to the SSM document `parameter` that will define how your automation will branch out.
        /// </summary>
        [Input("automationTargetParameterName")]
        public Input<string>? AutomationTargetParameterName { get; set; }

        /// <summary>
        /// The compliance severity for the association. Can be one of the following: `UNSPECIFIED`, `LOW`, `MEDIUM`, `HIGH` or `CRITICAL`
        /// </summary>
        [Input("complianceSeverity")]
        public Input<string>? ComplianceSeverity { get; set; }

        /// <summary>
        /// The document version you want to associate with the target(s). Can be a specific version or the default version.
        /// </summary>
        [Input("documentVersion")]
        public Input<string>? DocumentVersion { get; set; }

        /// <summary>
        /// The instance ID to apply an SSM document to. Use `targets` with key `InstanceIds` for document schema versions 2.0 and above. Use the `targets` attribute instead.
        /// </summary>
        [Input("instanceId")]
        public Input<string>? InstanceId { get; set; }

        /// <summary>
        /// The maximum number of targets allowed to run the association at the same time. You can specify a number, for example 10, or a percentage of the target set, for example 10%.
        /// </summary>
        [Input("maxConcurrency")]
        public Input<string>? MaxConcurrency { get; set; }

        /// <summary>
        /// The number of errors that are allowed before the system stops sending requests to run the association on additional targets. You can specify a number, for example 10, or a percentage of the target set, for example 10%. If you specify a threshold of 3, the stop command is sent when the fourth error is returned. If you specify a threshold of 10% for 50 associations, the stop command is sent when the sixth error is returned.
        /// </summary>
        [Input("maxErrors")]
        public Input<string>? MaxErrors { get; set; }

        /// <summary>
        /// The name of the SSM document to apply.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// An output location block. Output Location is documented below.
        /// </summary>
        [Input("outputLocation")]
        public Input<Inputs.AssociationOutputLocationGetArgs>? OutputLocation { get; set; }

        [Input("parameters")]
        private InputMap<string>? _parameters;

        /// <summary>
        /// A block of arbitrary string parameters to pass to the SSM document.
        /// </summary>
        public InputMap<string> Parameters
        {
            get => _parameters ?? (_parameters = new InputMap<string>());
            set => _parameters = value;
        }

        /// <summary>
        /// A [cron or rate expression](https://docs.aws.amazon.com/systems-manager/latest/userguide/reference-cron-and-rate-expressions.html) that specifies when the association runs.
        /// </summary>
        [Input("scheduleExpression")]
        public Input<string>? ScheduleExpression { get; set; }

        [Input("targets")]
        private InputList<Inputs.AssociationTargetGetArgs>? _targets;

        /// <summary>
        /// A block containing the targets of the SSM association. Targets are documented below. AWS currently supports a maximum of 5 targets.
        /// </summary>
        public InputList<Inputs.AssociationTargetGetArgs> Targets
        {
            get => _targets ?? (_targets = new InputList<Inputs.AssociationTargetGetArgs>());
            set => _targets = value;
        }

        /// <summary>
        /// The number of seconds to wait for the association status to be `Success`. If `Success` status is not reached within the given time, create opration will fail.
        /// 
        /// Output Location (`output_location`) is an S3 bucket where you want to store the results of this association:
        /// </summary>
        [Input("waitForSuccessTimeoutSeconds")]
        public Input<int>? WaitForSuccessTimeoutSeconds { get; set; }

        public AssociationState()
        {
        }
        public static new AssociationState Empty => new AssociationState();
    }
}
