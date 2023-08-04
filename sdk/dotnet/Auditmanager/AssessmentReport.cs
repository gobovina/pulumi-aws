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
    /// Resource for managing an AWS Audit Manager Assessment Report.
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
    ///     var test = new Aws.Auditmanager.AssessmentReport("test", new()
    ///     {
    ///         AssessmentId = aws_auditmanager_assessment.Test.Id,
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// terraform import {
    /// 
    ///  to = aws_auditmanager_assessment_report.example
    /// 
    ///  id = "abc123-de45" } Using `pulumi import`, import Audit Manager Assessment Reports using the assessment report `id`. For exampleconsole % pulumi import aws_auditmanager_assessment_report.example abc123-de45
    /// </summary>
    [AwsResourceType("aws:auditmanager/assessmentReport:AssessmentReport")]
    public partial class AssessmentReport : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Unique identifier of the assessment to create the report from.
        /// 
        /// The following arguments are optional:
        /// </summary>
        [Output("assessmentId")]
        public Output<string> AssessmentId { get; private set; } = null!;

        /// <summary>
        /// Name of the user who created the assessment report.
        /// </summary>
        [Output("author")]
        public Output<string> Author { get; private set; } = null!;

        /// <summary>
        /// Description of the assessment report.
        /// </summary>
        [Output("description")]
        public Output<string?> Description { get; private set; } = null!;

        /// <summary>
        /// Name of the assessment report.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// Current status of the specified assessment report. Valid values are `COMPLETE`, `IN_PROGRESS`, and `FAILED`.
        /// </summary>
        [Output("status")]
        public Output<string> Status { get; private set; } = null!;


        /// <summary>
        /// Create a AssessmentReport resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public AssessmentReport(string name, AssessmentReportArgs args, CustomResourceOptions? options = null)
            : base("aws:auditmanager/assessmentReport:AssessmentReport", name, args ?? new AssessmentReportArgs(), MakeResourceOptions(options, ""))
        {
        }

        private AssessmentReport(string name, Input<string> id, AssessmentReportState? state = null, CustomResourceOptions? options = null)
            : base("aws:auditmanager/assessmentReport:AssessmentReport", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing AssessmentReport resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static AssessmentReport Get(string name, Input<string> id, AssessmentReportState? state = null, CustomResourceOptions? options = null)
        {
            return new AssessmentReport(name, id, state, options);
        }
    }

    public sealed class AssessmentReportArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Unique identifier of the assessment to create the report from.
        /// 
        /// The following arguments are optional:
        /// </summary>
        [Input("assessmentId", required: true)]
        public Input<string> AssessmentId { get; set; } = null!;

        /// <summary>
        /// Description of the assessment report.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// Name of the assessment report.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        public AssessmentReportArgs()
        {
        }
        public static new AssessmentReportArgs Empty => new AssessmentReportArgs();
    }

    public sealed class AssessmentReportState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Unique identifier of the assessment to create the report from.
        /// 
        /// The following arguments are optional:
        /// </summary>
        [Input("assessmentId")]
        public Input<string>? AssessmentId { get; set; }

        /// <summary>
        /// Name of the user who created the assessment report.
        /// </summary>
        [Input("author")]
        public Input<string>? Author { get; set; }

        /// <summary>
        /// Description of the assessment report.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// Name of the assessment report.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Current status of the specified assessment report. Valid values are `COMPLETE`, `IN_PROGRESS`, and `FAILED`.
        /// </summary>
        [Input("status")]
        public Input<string>? Status { get; set; }

        public AssessmentReportState()
        {
        }
        public static new AssessmentReportState Empty => new AssessmentReportState();
    }
}
