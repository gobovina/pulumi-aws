// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Sagemaker
{
    /// <summary>
    /// Provides a SageMaker Model Package Group Policy resource.
    /// 
    /// ## Example Usage
    /// 
    /// ## Import
    /// 
    /// Using `pulumi import`, import SageMaker Model Package Groups using the `name`. For example:
    /// 
    /// ```sh
    /// $ pulumi import aws:sagemaker/modelPackageGroupPolicy:ModelPackageGroupPolicy example example
    /// ```
    /// </summary>
    [AwsResourceType("aws:sagemaker/modelPackageGroupPolicy:ModelPackageGroupPolicy")]
    public partial class ModelPackageGroupPolicy : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The name of the model package group.
        /// </summary>
        [Output("modelPackageGroupName")]
        public Output<string> ModelPackageGroupName { get; private set; } = null!;

        [Output("resourcePolicy")]
        public Output<string> ResourcePolicy { get; private set; } = null!;


        /// <summary>
        /// Create a ModelPackageGroupPolicy resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public ModelPackageGroupPolicy(string name, ModelPackageGroupPolicyArgs args, CustomResourceOptions? options = null)
            : base("aws:sagemaker/modelPackageGroupPolicy:ModelPackageGroupPolicy", name, args ?? new ModelPackageGroupPolicyArgs(), MakeResourceOptions(options, ""))
        {
        }

        private ModelPackageGroupPolicy(string name, Input<string> id, ModelPackageGroupPolicyState? state = null, CustomResourceOptions? options = null)
            : base("aws:sagemaker/modelPackageGroupPolicy:ModelPackageGroupPolicy", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing ModelPackageGroupPolicy resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static ModelPackageGroupPolicy Get(string name, Input<string> id, ModelPackageGroupPolicyState? state = null, CustomResourceOptions? options = null)
        {
            return new ModelPackageGroupPolicy(name, id, state, options);
        }
    }

    public sealed class ModelPackageGroupPolicyArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The name of the model package group.
        /// </summary>
        [Input("modelPackageGroupName", required: true)]
        public Input<string> ModelPackageGroupName { get; set; } = null!;

        [Input("resourcePolicy", required: true)]
        public Input<string> ResourcePolicy { get; set; } = null!;

        public ModelPackageGroupPolicyArgs()
        {
        }
        public static new ModelPackageGroupPolicyArgs Empty => new ModelPackageGroupPolicyArgs();
    }

    public sealed class ModelPackageGroupPolicyState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The name of the model package group.
        /// </summary>
        [Input("modelPackageGroupName")]
        public Input<string>? ModelPackageGroupName { get; set; }

        [Input("resourcePolicy")]
        public Input<string>? ResourcePolicy { get; set; }

        public ModelPackageGroupPolicyState()
        {
        }
        public static new ModelPackageGroupPolicyState Empty => new ModelPackageGroupPolicyState();
    }
}
