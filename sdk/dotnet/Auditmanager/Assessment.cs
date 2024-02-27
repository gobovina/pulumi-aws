// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Auditmanager
{
    /// <summary>
    /// Resource for managing an AWS Audit Manager Assessment.
    /// 
    /// ## Example Usage
    /// ### Basic Usage
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Aws = Pulumi.Aws;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var test = new Aws.Auditmanager.Assessment("test", new()
    ///     {
    ///         AssessmentReportsDestination = new Aws.Auditmanager.Inputs.AssessmentAssessmentReportsDestinationArgs
    ///         {
    ///             Destination = $"s3://{aws_s3_bucket.Test.Id}",
    ///             DestinationType = "S3",
    ///         },
    ///         FrameworkId = aws_auditmanager_framework.Test.Id,
    ///         Roles = new[]
    ///         {
    ///             new Aws.Auditmanager.Inputs.AssessmentRoleArgs
    ///             {
    ///                 RoleArn = aws_iam_role.Test.Arn,
    ///                 RoleType = "PROCESS_OWNER",
    ///             },
    ///         },
    ///         Scope = new Aws.Auditmanager.Inputs.AssessmentScopeArgs
    ///         {
    ///             AwsAccounts = new[]
    ///             {
    ///                 new Aws.Auditmanager.Inputs.AssessmentScopeAwsAccountArgs
    ///                 {
    ///                     Id = data.Aws_caller_identity.Current.Account_id,
    ///                 },
    ///             },
    ///             AwsServices = new[]
    ///             {
    ///                 new Aws.Auditmanager.Inputs.AssessmentScopeAwsServiceArgs
    ///                 {
    ///                     ServiceName = "S3",
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
    /// Using `pulumi import`, import Audit Manager Assessments using the assessment `id`. For example:
    /// 
    /// ```sh
    ///  $ pulumi import aws:auditmanager/assessment:Assessment example abc123-de45
    /// ```
    /// </summary>
    [AwsResourceType("aws:auditmanager/assessment:Assessment")]
    public partial class Assessment : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Amazon Resource Name (ARN) of the assessment.
        /// </summary>
        [Output("arn")]
        public Output<string> Arn { get; private set; } = null!;

        /// <summary>
        /// Assessment report storage destination configuration. See `assessment_reports_destination` below.
        /// </summary>
        [Output("assessmentReportsDestination")]
        public Output<Outputs.AssessmentAssessmentReportsDestination?> AssessmentReportsDestination { get; private set; } = null!;

        /// <summary>
        /// Description of the assessment.
        /// </summary>
        [Output("description")]
        public Output<string?> Description { get; private set; } = null!;

        /// <summary>
        /// Unique identifier of the framework the assessment will be created from.
        /// </summary>
        [Output("frameworkId")]
        public Output<string> FrameworkId { get; private set; } = null!;

        /// <summary>
        /// Name of the assessment.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// List of roles for the assessment. See `roles` below.
        /// </summary>
        [Output("roles")]
        public Output<ImmutableArray<Outputs.AssessmentRole>> Roles { get; private set; } = null!;

        /// <summary>
        /// Complete list of all roles with access to the assessment. This includes both roles explicitly configured via the `roles` block, and any roles which have access to all Audit Manager assessments by default.
        /// </summary>
        [Output("rolesAlls")]
        public Output<ImmutableArray<Outputs.AssessmentRolesAll>> RolesAlls { get; private set; } = null!;

        /// <summary>
        /// Amazon Web Services accounts and services that are in scope for the assessment. See `scope` below.
        /// 
        /// The following arguments are optional:
        /// </summary>
        [Output("scope")]
        public Output<Outputs.AssessmentScope?> Scope { get; private set; } = null!;

        /// <summary>
        /// Status of the assessment. Valid values are `ACTIVE` and `INACTIVE`.
        /// </summary>
        [Output("status")]
        public Output<string> Status { get; private set; } = null!;

        /// <summary>
        /// A map of tags to assign to the assessment. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        /// </summary>
        [Output("tags")]
        public Output<ImmutableDictionary<string, string>?> Tags { get; private set; } = null!;

        [Output("tagsAll")]
        public Output<ImmutableDictionary<string, string>> TagsAll { get; private set; } = null!;


        /// <summary>
        /// Create a Assessment resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Assessment(string name, AssessmentArgs args, CustomResourceOptions? options = null)
            : base("aws:auditmanager/assessment:Assessment", name, args ?? new AssessmentArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Assessment(string name, Input<string> id, AssessmentState? state = null, CustomResourceOptions? options = null)
            : base("aws:auditmanager/assessment:Assessment", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing Assessment resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Assessment Get(string name, Input<string> id, AssessmentState? state = null, CustomResourceOptions? options = null)
        {
            return new Assessment(name, id, state, options);
        }
    }

    public sealed class AssessmentArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Assessment report storage destination configuration. See `assessment_reports_destination` below.
        /// </summary>
        [Input("assessmentReportsDestination")]
        public Input<Inputs.AssessmentAssessmentReportsDestinationArgs>? AssessmentReportsDestination { get; set; }

        /// <summary>
        /// Description of the assessment.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// Unique identifier of the framework the assessment will be created from.
        /// </summary>
        [Input("frameworkId", required: true)]
        public Input<string> FrameworkId { get; set; } = null!;

        /// <summary>
        /// Name of the assessment.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("roles", required: true)]
        private InputList<Inputs.AssessmentRoleArgs>? _roles;

        /// <summary>
        /// List of roles for the assessment. See `roles` below.
        /// </summary>
        public InputList<Inputs.AssessmentRoleArgs> Roles
        {
            get => _roles ?? (_roles = new InputList<Inputs.AssessmentRoleArgs>());
            set => _roles = value;
        }

        /// <summary>
        /// Amazon Web Services accounts and services that are in scope for the assessment. See `scope` below.
        /// 
        /// The following arguments are optional:
        /// </summary>
        [Input("scope")]
        public Input<Inputs.AssessmentScopeArgs>? Scope { get; set; }

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// A map of tags to assign to the assessment. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        /// </summary>
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        public AssessmentArgs()
        {
        }
        public static new AssessmentArgs Empty => new AssessmentArgs();
    }

    public sealed class AssessmentState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Amazon Resource Name (ARN) of the assessment.
        /// </summary>
        [Input("arn")]
        public Input<string>? Arn { get; set; }

        /// <summary>
        /// Assessment report storage destination configuration. See `assessment_reports_destination` below.
        /// </summary>
        [Input("assessmentReportsDestination")]
        public Input<Inputs.AssessmentAssessmentReportsDestinationGetArgs>? AssessmentReportsDestination { get; set; }

        /// <summary>
        /// Description of the assessment.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// Unique identifier of the framework the assessment will be created from.
        /// </summary>
        [Input("frameworkId")]
        public Input<string>? FrameworkId { get; set; }

        /// <summary>
        /// Name of the assessment.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("roles")]
        private InputList<Inputs.AssessmentRoleGetArgs>? _roles;

        /// <summary>
        /// List of roles for the assessment. See `roles` below.
        /// </summary>
        public InputList<Inputs.AssessmentRoleGetArgs> Roles
        {
            get => _roles ?? (_roles = new InputList<Inputs.AssessmentRoleGetArgs>());
            set => _roles = value;
        }

        [Input("rolesAlls")]
        private InputList<Inputs.AssessmentRolesAllGetArgs>? _rolesAlls;

        /// <summary>
        /// Complete list of all roles with access to the assessment. This includes both roles explicitly configured via the `roles` block, and any roles which have access to all Audit Manager assessments by default.
        /// </summary>
        public InputList<Inputs.AssessmentRolesAllGetArgs> RolesAlls
        {
            get => _rolesAlls ?? (_rolesAlls = new InputList<Inputs.AssessmentRolesAllGetArgs>());
            set => _rolesAlls = value;
        }

        /// <summary>
        /// Amazon Web Services accounts and services that are in scope for the assessment. See `scope` below.
        /// 
        /// The following arguments are optional:
        /// </summary>
        [Input("scope")]
        public Input<Inputs.AssessmentScopeGetArgs>? Scope { get; set; }

        /// <summary>
        /// Status of the assessment. Valid values are `ACTIVE` and `INACTIVE`.
        /// </summary>
        [Input("status")]
        public Input<string>? Status { get; set; }

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// A map of tags to assign to the assessment. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
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

        public AssessmentState()
        {
        }
        public static new AssessmentState Empty => new AssessmentState();
    }
}
