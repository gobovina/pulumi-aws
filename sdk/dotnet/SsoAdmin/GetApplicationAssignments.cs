// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.SsoAdmin
{
    public static class GetApplicationAssignments
    {
        /// <summary>
        /// Data source for managing AWS SSO Admin Application Assignments.
        /// 
        /// ## Example Usage
        /// 
        /// ### Basic Usage
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
        ///     var example = Aws.SsoAdmin.GetApplicationAssignments.Invoke(new()
        ///     {
        ///         ApplicationArn = exampleAwsSsoadminApplication.ApplicationArn,
        ///     });
        /// 
        /// });
        /// ```
        /// &lt;!--End PulumiCodeChooser --&gt;
        /// </summary>
        public static Task<GetApplicationAssignmentsResult> InvokeAsync(GetApplicationAssignmentsArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetApplicationAssignmentsResult>("aws:ssoadmin/getApplicationAssignments:getApplicationAssignments", args ?? new GetApplicationAssignmentsArgs(), options.WithDefaults());

        /// <summary>
        /// Data source for managing AWS SSO Admin Application Assignments.
        /// 
        /// ## Example Usage
        /// 
        /// ### Basic Usage
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
        ///     var example = Aws.SsoAdmin.GetApplicationAssignments.Invoke(new()
        ///     {
        ///         ApplicationArn = exampleAwsSsoadminApplication.ApplicationArn,
        ///     });
        /// 
        /// });
        /// ```
        /// &lt;!--End PulumiCodeChooser --&gt;
        /// </summary>
        public static Output<GetApplicationAssignmentsResult> Invoke(GetApplicationAssignmentsInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetApplicationAssignmentsResult>("aws:ssoadmin/getApplicationAssignments:getApplicationAssignments", args ?? new GetApplicationAssignmentsInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetApplicationAssignmentsArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// ARN of the application.
        /// </summary>
        [Input("applicationArn", required: true)]
        public string ApplicationArn { get; set; } = null!;

        [Input("applicationAssignments")]
        private List<Inputs.GetApplicationAssignmentsApplicationAssignmentArgs>? _applicationAssignments;

        /// <summary>
        /// List of principals assigned to the application. See the `application_assignments` attribute reference below.
        /// </summary>
        public List<Inputs.GetApplicationAssignmentsApplicationAssignmentArgs> ApplicationAssignments
        {
            get => _applicationAssignments ?? (_applicationAssignments = new List<Inputs.GetApplicationAssignmentsApplicationAssignmentArgs>());
            set => _applicationAssignments = value;
        }

        public GetApplicationAssignmentsArgs()
        {
        }
        public static new GetApplicationAssignmentsArgs Empty => new GetApplicationAssignmentsArgs();
    }

    public sealed class GetApplicationAssignmentsInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// ARN of the application.
        /// </summary>
        [Input("applicationArn", required: true)]
        public Input<string> ApplicationArn { get; set; } = null!;

        [Input("applicationAssignments")]
        private InputList<Inputs.GetApplicationAssignmentsApplicationAssignmentInputArgs>? _applicationAssignments;

        /// <summary>
        /// List of principals assigned to the application. See the `application_assignments` attribute reference below.
        /// </summary>
        public InputList<Inputs.GetApplicationAssignmentsApplicationAssignmentInputArgs> ApplicationAssignments
        {
            get => _applicationAssignments ?? (_applicationAssignments = new InputList<Inputs.GetApplicationAssignmentsApplicationAssignmentInputArgs>());
            set => _applicationAssignments = value;
        }

        public GetApplicationAssignmentsInvokeArgs()
        {
        }
        public static new GetApplicationAssignmentsInvokeArgs Empty => new GetApplicationAssignmentsInvokeArgs();
    }


    [OutputType]
    public sealed class GetApplicationAssignmentsResult
    {
        /// <summary>
        /// ARN of the application.
        /// </summary>
        public readonly string ApplicationArn;
        /// <summary>
        /// List of principals assigned to the application. See the `application_assignments` attribute reference below.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetApplicationAssignmentsApplicationAssignmentResult> ApplicationAssignments;
        public readonly string Id;

        [OutputConstructor]
        private GetApplicationAssignmentsResult(
            string applicationArn,

            ImmutableArray<Outputs.GetApplicationAssignmentsApplicationAssignmentResult> applicationAssignments,

            string id)
        {
            ApplicationArn = applicationArn;
            ApplicationAssignments = applicationAssignments;
            Id = id;
        }
    }
}
