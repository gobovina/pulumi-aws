// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Location
{
    public static class GetRouteCalculator
    {
        /// <summary>
        /// Retrieve information about a Location Service Route Calculator.
        /// 
        /// ## Example Usage
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
        ///     var example = Aws.Location.GetRouteCalculator.Invoke(new()
        ///     {
        ///         CalculatorName = "example",
        ///     });
        /// 
        /// });
        /// ```
        /// &lt;!--End PulumiCodeChooser --&gt;
        /// </summary>
        public static Task<GetRouteCalculatorResult> InvokeAsync(GetRouteCalculatorArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetRouteCalculatorResult>("aws:location/getRouteCalculator:getRouteCalculator", args ?? new GetRouteCalculatorArgs(), options.WithDefaults());

        /// <summary>
        /// Retrieve information about a Location Service Route Calculator.
        /// 
        /// ## Example Usage
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
        ///     var example = Aws.Location.GetRouteCalculator.Invoke(new()
        ///     {
        ///         CalculatorName = "example",
        ///     });
        /// 
        /// });
        /// ```
        /// &lt;!--End PulumiCodeChooser --&gt;
        /// </summary>
        public static Output<GetRouteCalculatorResult> Invoke(GetRouteCalculatorInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetRouteCalculatorResult>("aws:location/getRouteCalculator:getRouteCalculator", args ?? new GetRouteCalculatorInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetRouteCalculatorArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Name of the route calculator resource.
        /// </summary>
        [Input("calculatorName", required: true)]
        public string CalculatorName { get; set; } = null!;

        [Input("tags")]
        private Dictionary<string, string>? _tags;

        /// <summary>
        /// Key-value map of resource tags for the route calculator.
        /// </summary>
        public Dictionary<string, string> Tags
        {
            get => _tags ?? (_tags = new Dictionary<string, string>());
            set => _tags = value;
        }

        public GetRouteCalculatorArgs()
        {
        }
        public static new GetRouteCalculatorArgs Empty => new GetRouteCalculatorArgs();
    }

    public sealed class GetRouteCalculatorInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Name of the route calculator resource.
        /// </summary>
        [Input("calculatorName", required: true)]
        public Input<string> CalculatorName { get; set; } = null!;

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// Key-value map of resource tags for the route calculator.
        /// </summary>
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        public GetRouteCalculatorInvokeArgs()
        {
        }
        public static new GetRouteCalculatorInvokeArgs Empty => new GetRouteCalculatorInvokeArgs();
    }


    [OutputType]
    public sealed class GetRouteCalculatorResult
    {
        /// <summary>
        /// ARN for the Route calculator resource. Use the ARN when you specify a resource across AWS.
        /// </summary>
        public readonly string CalculatorArn;
        public readonly string CalculatorName;
        /// <summary>
        /// Timestamp for when the route calculator resource was created in ISO 8601 format.
        /// </summary>
        public readonly string CreateTime;
        /// <summary>
        /// Data provider of traffic and road network data.
        /// </summary>
        public readonly string DataSource;
        /// <summary>
        /// Optional description of the route calculator resource.
        /// </summary>
        public readonly string Description;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// Key-value map of resource tags for the route calculator.
        /// </summary>
        public readonly ImmutableDictionary<string, string> Tags;
        /// <summary>
        /// Timestamp for when the route calculator resource was last updated in ISO 8601 format.
        /// </summary>
        public readonly string UpdateTime;

        [OutputConstructor]
        private GetRouteCalculatorResult(
            string calculatorArn,

            string calculatorName,

            string createTime,

            string dataSource,

            string description,

            string id,

            ImmutableDictionary<string, string> tags,

            string updateTime)
        {
            CalculatorArn = calculatorArn;
            CalculatorName = calculatorName;
            CreateTime = createTime;
            DataSource = dataSource;
            Description = description;
            Id = id;
            Tags = tags;
            UpdateTime = updateTime;
        }
    }
}
