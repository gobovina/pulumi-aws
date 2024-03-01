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
    /// Provides a SageMaker Device resource.
    /// 
    /// ## Example Usage
    /// ### Basic usage
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Aws = Pulumi.Aws;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var example = new Aws.Sagemaker.Device("example", new()
    ///     {
    ///         DeviceFleetName = exampleAwsSagemakerDeviceFleet.DeviceFleetName,
    ///         DeviceDetails = new Aws.Sagemaker.Inputs.DeviceDeviceArgs
    ///         {
    ///             DeviceName = "example",
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Using `pulumi import`, import SageMaker Devices using the `device-fleet-name/device-name`. For example:
    /// 
    /// ```sh
    ///  $ pulumi import aws:sagemaker/device:Device example my-fleet/my-device
    /// ```
    /// </summary>
    [AwsResourceType("aws:sagemaker/device:Device")]
    public partial class Device : global::Pulumi.CustomResource
    {
        [Output("agentVersion")]
        public Output<string> AgentVersion { get; private set; } = null!;

        /// <summary>
        /// The Amazon Resource Name (ARN) assigned by AWS to this Device.
        /// </summary>
        [Output("arn")]
        public Output<string> Arn { get; private set; } = null!;

        /// <summary>
        /// The device to register with SageMaker Edge Manager. See Device details below.
        /// </summary>
        [Output("device")]
        public Output<Outputs.DeviceDevice> DeviceDetails { get; private set; } = null!;

        /// <summary>
        /// The name of the Device Fleet.
        /// </summary>
        [Output("deviceFleetName")]
        public Output<string> DeviceFleetName { get; private set; } = null!;


        /// <summary>
        /// Create a Device resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Device(string name, DeviceArgs args, CustomResourceOptions? options = null)
            : base("aws:sagemaker/device:Device", name, args ?? new DeviceArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Device(string name, Input<string> id, DeviceState? state = null, CustomResourceOptions? options = null)
            : base("aws:sagemaker/device:Device", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing Device resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Device Get(string name, Input<string> id, DeviceState? state = null, CustomResourceOptions? options = null)
        {
            return new Device(name, id, state, options);
        }
    }

    public sealed class DeviceArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The device to register with SageMaker Edge Manager. See Device details below.
        /// </summary>
        [Input("device", required: true)]
        public Input<Inputs.DeviceDeviceArgs> DeviceDetails { get; set; } = null!;

        /// <summary>
        /// The name of the Device Fleet.
        /// </summary>
        [Input("deviceFleetName", required: true)]
        public Input<string> DeviceFleetName { get; set; } = null!;

        public DeviceArgs()
        {
        }
        public static new DeviceArgs Empty => new DeviceArgs();
    }

    public sealed class DeviceState : global::Pulumi.ResourceArgs
    {
        [Input("agentVersion")]
        public Input<string>? AgentVersion { get; set; }

        /// <summary>
        /// The Amazon Resource Name (ARN) assigned by AWS to this Device.
        /// </summary>
        [Input("arn")]
        public Input<string>? Arn { get; set; }

        /// <summary>
        /// The device to register with SageMaker Edge Manager. See Device details below.
        /// </summary>
        [Input("device")]
        public Input<Inputs.DeviceDeviceGetArgs>? DeviceDetails { get; set; }

        /// <summary>
        /// The name of the Device Fleet.
        /// </summary>
        [Input("deviceFleetName")]
        public Input<string>? DeviceFleetName { get; set; }

        public DeviceState()
        {
        }
        public static new DeviceState Empty => new DeviceState();
    }
}
