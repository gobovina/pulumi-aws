// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.NetworkFirewall
{
    public static class GetFirewallPolicy
    {
        /// <summary>
        /// Retrieve information about a firewall policy.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// ### Find firewall policy by name
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Aws = Pulumi.Aws;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var example = Aws.NetworkFirewall.GetFirewallPolicy.Invoke(new()
        ///     {
        ///         Name = firewallPolicyName,
        ///     });
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% example %}}
        /// ### Find firewall policy by ARN
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Aws = Pulumi.Aws;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var example = Aws.NetworkFirewall.GetFirewallPolicy.Invoke(new()
        ///     {
        ///         Arn = firewallPolicyArn,
        ///     });
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% example %}}
        /// ### Find firewall policy by name and ARN
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Aws = Pulumi.Aws;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var example = Aws.NetworkFirewall.GetFirewallPolicy.Invoke(new()
        ///     {
        ///         Arn = firewallPolicyArn,
        ///         Name = firewallPolicyName,
        ///     });
        /// 
        /// });
        /// ```
        /// 
        /// AWS Network Firewall does not allow multiple firewall policies with the same name to be created in an account. It is possible, however, to have multiple firewall policies available in a single account with identical `name` values but distinct `arn` values, e.g. firewall policies shared via a [Resource Access Manager (RAM) share][1]. In that case specifying `arn`, or `name` and `arn`, is recommended.
        /// 
        /// &gt; **Note:** If there are multiple firewall policies in an account with the same `name`, and `arn` is not specified, the default behavior will return the firewall policy with `name` that was created in the account.
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetFirewallPolicyResult> InvokeAsync(GetFirewallPolicyArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetFirewallPolicyResult>("aws:networkfirewall/getFirewallPolicy:getFirewallPolicy", args ?? new GetFirewallPolicyArgs(), options.WithDefaults());

        /// <summary>
        /// Retrieve information about a firewall policy.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// ### Find firewall policy by name
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Aws = Pulumi.Aws;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var example = Aws.NetworkFirewall.GetFirewallPolicy.Invoke(new()
        ///     {
        ///         Name = firewallPolicyName,
        ///     });
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% example %}}
        /// ### Find firewall policy by ARN
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Aws = Pulumi.Aws;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var example = Aws.NetworkFirewall.GetFirewallPolicy.Invoke(new()
        ///     {
        ///         Arn = firewallPolicyArn,
        ///     });
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% example %}}
        /// ### Find firewall policy by name and ARN
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Aws = Pulumi.Aws;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var example = Aws.NetworkFirewall.GetFirewallPolicy.Invoke(new()
        ///     {
        ///         Arn = firewallPolicyArn,
        ///         Name = firewallPolicyName,
        ///     });
        /// 
        /// });
        /// ```
        /// 
        /// AWS Network Firewall does not allow multiple firewall policies with the same name to be created in an account. It is possible, however, to have multiple firewall policies available in a single account with identical `name` values but distinct `arn` values, e.g. firewall policies shared via a [Resource Access Manager (RAM) share][1]. In that case specifying `arn`, or `name` and `arn`, is recommended.
        /// 
        /// &gt; **Note:** If there are multiple firewall policies in an account with the same `name`, and `arn` is not specified, the default behavior will return the firewall policy with `name` that was created in the account.
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Output<GetFirewallPolicyResult> Invoke(GetFirewallPolicyInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetFirewallPolicyResult>("aws:networkfirewall/getFirewallPolicy:getFirewallPolicy", args ?? new GetFirewallPolicyInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetFirewallPolicyArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// ARN of the firewall policy.
        /// </summary>
        [Input("arn")]
        public string? Arn { get; set; }

        /// <summary>
        /// Descriptive name of the firewall policy.
        /// </summary>
        [Input("name")]
        public string? Name { get; set; }

        [Input("tags")]
        private Dictionary<string, string>? _tags;

        /// <summary>
        /// Key-value tags for the firewall policy.
        /// </summary>
        public Dictionary<string, string> Tags
        {
            get => _tags ?? (_tags = new Dictionary<string, string>());
            set => _tags = value;
        }

        public GetFirewallPolicyArgs()
        {
        }
        public static new GetFirewallPolicyArgs Empty => new GetFirewallPolicyArgs();
    }

    public sealed class GetFirewallPolicyInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// ARN of the firewall policy.
        /// </summary>
        [Input("arn")]
        public Input<string>? Arn { get; set; }

        /// <summary>
        /// Descriptive name of the firewall policy.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// Key-value tags for the firewall policy.
        /// </summary>
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        public GetFirewallPolicyInvokeArgs()
        {
        }
        public static new GetFirewallPolicyInvokeArgs Empty => new GetFirewallPolicyInvokeArgs();
    }


    [OutputType]
    public sealed class GetFirewallPolicyResult
    {
        public readonly string? Arn;
        /// <summary>
        /// Description of the firewall policy.
        /// </summary>
        public readonly string Description;
        /// <summary>
        /// The [policy][2] for the specified firewall policy.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetFirewallPolicyFirewallPolicyResult> FirewallPolicies;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly string? Name;
        /// <summary>
        /// Key-value tags for the firewall policy.
        /// </summary>
        public readonly ImmutableDictionary<string, string> Tags;
        /// <summary>
        /// Token used for optimistic locking.
        /// </summary>
        public readonly string UpdateToken;

        [OutputConstructor]
        private GetFirewallPolicyResult(
            string? arn,

            string description,

            ImmutableArray<Outputs.GetFirewallPolicyFirewallPolicyResult> firewallPolicies,

            string id,

            string? name,

            ImmutableDictionary<string, string> tags,

            string updateToken)
        {
            Arn = arn;
            Description = description;
            FirewallPolicies = firewallPolicies;
            Id = id;
            Name = name;
            Tags = tags;
            UpdateToken = updateToken;
        }
    }
}
