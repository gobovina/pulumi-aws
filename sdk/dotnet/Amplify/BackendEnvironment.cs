// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Amplify
{
    /// <summary>
    /// Provides an Amplify Backend Environment resource.
    /// 
    /// ## Example Usage
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Aws = Pulumi.Aws;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var example = new Aws.Amplify.App("example", new()
    ///     {
    ///         Name = "example",
    ///     });
    /// 
    ///     var exampleBackendEnvironment = new Aws.Amplify.BackendEnvironment("example", new()
    ///     {
    ///         AppId = example.Id,
    ///         EnvironmentName = "example",
    ///         DeploymentArtifacts = "app-example-deployment",
    ///         StackName = "amplify-app-example",
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Using `pulumi import`, import Amplify backend environment using `app_id` and `environment_name`. For example:
    /// 
    /// ```sh
    ///  $ pulumi import aws:amplify/backendEnvironment:BackendEnvironment example d2ypk4k47z8u6/example
    /// ```
    /// </summary>
    [AwsResourceType("aws:amplify/backendEnvironment:BackendEnvironment")]
    public partial class BackendEnvironment : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Unique ID for an Amplify app.
        /// </summary>
        [Output("appId")]
        public Output<string> AppId { get; private set; } = null!;

        /// <summary>
        /// ARN for a backend environment that is part of an Amplify app.
        /// </summary>
        [Output("arn")]
        public Output<string> Arn { get; private set; } = null!;

        /// <summary>
        /// Name of deployment artifacts.
        /// </summary>
        [Output("deploymentArtifacts")]
        public Output<string> DeploymentArtifacts { get; private set; } = null!;

        /// <summary>
        /// Name for the backend environment.
        /// </summary>
        [Output("environmentName")]
        public Output<string> EnvironmentName { get; private set; } = null!;

        /// <summary>
        /// AWS CloudFormation stack name of a backend environment.
        /// </summary>
        [Output("stackName")]
        public Output<string> StackName { get; private set; } = null!;


        /// <summary>
        /// Create a BackendEnvironment resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public BackendEnvironment(string name, BackendEnvironmentArgs args, CustomResourceOptions? options = null)
            : base("aws:amplify/backendEnvironment:BackendEnvironment", name, args ?? new BackendEnvironmentArgs(), MakeResourceOptions(options, ""))
        {
        }

        private BackendEnvironment(string name, Input<string> id, BackendEnvironmentState? state = null, CustomResourceOptions? options = null)
            : base("aws:amplify/backendEnvironment:BackendEnvironment", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing BackendEnvironment resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static BackendEnvironment Get(string name, Input<string> id, BackendEnvironmentState? state = null, CustomResourceOptions? options = null)
        {
            return new BackendEnvironment(name, id, state, options);
        }
    }

    public sealed class BackendEnvironmentArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Unique ID for an Amplify app.
        /// </summary>
        [Input("appId", required: true)]
        public Input<string> AppId { get; set; } = null!;

        /// <summary>
        /// Name of deployment artifacts.
        /// </summary>
        [Input("deploymentArtifacts")]
        public Input<string>? DeploymentArtifacts { get; set; }

        /// <summary>
        /// Name for the backend environment.
        /// </summary>
        [Input("environmentName", required: true)]
        public Input<string> EnvironmentName { get; set; } = null!;

        /// <summary>
        /// AWS CloudFormation stack name of a backend environment.
        /// </summary>
        [Input("stackName")]
        public Input<string>? StackName { get; set; }

        public BackendEnvironmentArgs()
        {
        }
        public static new BackendEnvironmentArgs Empty => new BackendEnvironmentArgs();
    }

    public sealed class BackendEnvironmentState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Unique ID for an Amplify app.
        /// </summary>
        [Input("appId")]
        public Input<string>? AppId { get; set; }

        /// <summary>
        /// ARN for a backend environment that is part of an Amplify app.
        /// </summary>
        [Input("arn")]
        public Input<string>? Arn { get; set; }

        /// <summary>
        /// Name of deployment artifacts.
        /// </summary>
        [Input("deploymentArtifacts")]
        public Input<string>? DeploymentArtifacts { get; set; }

        /// <summary>
        /// Name for the backend environment.
        /// </summary>
        [Input("environmentName")]
        public Input<string>? EnvironmentName { get; set; }

        /// <summary>
        /// AWS CloudFormation stack name of a backend environment.
        /// </summary>
        [Input("stackName")]
        public Input<string>? StackName { get; set; }

        public BackendEnvironmentState()
        {
        }
        public static new BackendEnvironmentState Empty => new BackendEnvironmentState();
    }
}
