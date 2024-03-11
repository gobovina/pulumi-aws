// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Ec2
{
    public static class GetSerialConsoleAccess
    {
        /// <summary>
        /// Provides a way to check whether serial console access is enabled for your AWS account in the current AWS region.
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
        ///     var current = Aws.Ec2.GetSerialConsoleAccess.Invoke();
        /// 
        /// });
        /// ```
        /// &lt;!--End PulumiCodeChooser --&gt;
        /// </summary>
        public static Task<GetSerialConsoleAccessResult> InvokeAsync(InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetSerialConsoleAccessResult>("aws:ec2/getSerialConsoleAccess:getSerialConsoleAccess", InvokeArgs.Empty, options.WithDefaults());

        /// <summary>
        /// Provides a way to check whether serial console access is enabled for your AWS account in the current AWS region.
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
        ///     var current = Aws.Ec2.GetSerialConsoleAccess.Invoke();
        /// 
        /// });
        /// ```
        /// &lt;!--End PulumiCodeChooser --&gt;
        /// </summary>
        public static Output<GetSerialConsoleAccessResult> Invoke(InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetSerialConsoleAccessResult>("aws:ec2/getSerialConsoleAccess:getSerialConsoleAccess", InvokeArgs.Empty, options.WithDefaults());
    }


    [OutputType]
    public sealed class GetSerialConsoleAccessResult
    {
        /// <summary>
        /// Whether or not serial console access is enabled. Returns as `true` or `false`.
        /// </summary>
        public readonly bool Enabled;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;

        [OutputConstructor]
        private GetSerialConsoleAccessResult(
            bool enabled,

            string id)
        {
            Enabled = enabled;
            Id = id;
        }
    }
}
