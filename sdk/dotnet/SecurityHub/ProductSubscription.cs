// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.SecurityHub
{
    /// <summary>
    /// Subscribes to a Security Hub product.
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
    ///     var example = new Aws.SecurityHub.Account("example");
    /// 
    ///     var current = Aws.GetRegion.Invoke();
    /// 
    ///     var exampleProductSubscription = new Aws.SecurityHub.ProductSubscription("example", new()
    ///     {
    ///         ProductArn = $"arn:aws:securityhub:{current.Apply(getRegionResult =&gt; getRegionResult.Name)}:733251395267:product/alertlogic/althreatmanagement",
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Using `pulumi import`, import Security Hub product subscriptions using `product_arn,arn`. For example:
    /// 
    /// ```sh
    ///  $ pulumi import aws:securityhub/productSubscription:ProductSubscription example arn:aws:securityhub:eu-west-1:733251395267:product/alertlogic/althreatmanagement,arn:aws:securityhub:eu-west-1:123456789012:product-subscription/alertlogic/althreatmanagement
    /// ```
    /// </summary>
    [AwsResourceType("aws:securityhub/productSubscription:ProductSubscription")]
    public partial class ProductSubscription : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The ARN of a resource that represents your subscription to the product that generates the findings that you want to import into Security Hub.
        /// </summary>
        [Output("arn")]
        public Output<string> Arn { get; private set; } = null!;

        /// <summary>
        /// The ARN of the product that generates findings that you want to import into Security Hub - see below.
        /// 
        /// Amazon maintains a list of [Product integrations in AWS Security Hub](https://docs.aws.amazon.com/securityhub/latest/userguide/securityhub-findings-providers.html) that changes over time. Any of the products on the linked [Available AWS service integrations](https://docs.aws.amazon.com/securityhub/latest/userguide/securityhub-internal-providers.html) or [Available third-party partner product integrations](https://docs.aws.amazon.com/securityhub/latest/userguide/securityhub-partner-providers.html) can be configured using `aws.securityhub.ProductSubscription`.
        /// 
        /// Available products can also be listed by running the AWS CLI command `aws securityhub describe-products`.
        /// 
        /// A subset of currently available products (remember to replace `${var.region}` as appropriate) includes:
        /// 
        /// * `arn:aws:securityhub:${var.region}::product/aws/guardduty`
        /// * `arn:aws:securityhub:${var.region}::product/aws/inspector`
        /// * `arn:aws:securityhub:${var.region}::product/aws/macie`
        /// * `arn:aws:securityhub:${var.region}::product/alertlogic/althreatmanagement`
        /// * `arn:aws:securityhub:${var.region}::product/armordefense/armoranywhere`
        /// * `arn:aws:securityhub:${var.region}::product/barracuda/cloudsecurityguardian`
        /// * `arn:aws:securityhub:${var.region}::product/checkpoint/cloudguard-iaas`
        /// * `arn:aws:securityhub:${var.region}::product/checkpoint/dome9-arc`
        /// * `arn:aws:securityhub:${var.region}::product/crowdstrike/crowdstrike-falcon`
        /// * `arn:aws:securityhub:${var.region}::product/cyberark/cyberark-pta`
        /// * `arn:aws:securityhub:${var.region}::product/f5networks/f5-advanced-waf`
        /// * `arn:aws:securityhub:${var.region}::product/fortinet/fortigate`
        /// * `arn:aws:securityhub:${var.region}::product/guardicore/aws-infection-monkey`
        /// * `arn:aws:securityhub:${var.region}::product/guardicore/guardicore`
        /// * `arn:aws:securityhub:${var.region}::product/ibm/qradar-siem`
        /// * `arn:aws:securityhub:${var.region}::product/imperva/imperva-attack-analytics`
        /// * `arn:aws:securityhub:${var.region}::product/mcafee-skyhigh/mcafee-mvision-cloud-aws`
        /// * `arn:aws:securityhub:${var.region}::product/paloaltonetworks/redlock`
        /// * `arn:aws:securityhub:${var.region}::product/paloaltonetworks/vm-series`
        /// * `arn:aws:securityhub:${var.region}::product/qualys/qualys-pc`
        /// * `arn:aws:securityhub:${var.region}::product/qualys/qualys-vm`
        /// * `arn:aws:securityhub:${var.region}::product/rapid7/insightvm`
        /// * `arn:aws:securityhub:${var.region}::product/sophos/sophos-server-protection`
        /// * `arn:aws:securityhub:${var.region}::product/splunk/splunk-enterprise`
        /// * `arn:aws:securityhub:${var.region}::product/splunk/splunk-phantom`
        /// * `arn:aws:securityhub:${var.region}::product/sumologicinc/sumologic-mda`
        /// * `arn:aws:securityhub:${var.region}::product/symantec-corp/symantec-cwp`
        /// * `arn:aws:securityhub:${var.region}::product/tenable/tenable-io`
        /// * `arn:aws:securityhub:${var.region}::product/trend-micro/deep-security`
        /// * `arn:aws:securityhub:${var.region}::product/turbot/turbot`
        /// * `arn:aws:securityhub:${var.region}::product/twistlock/twistlock-enterprise`
        /// </summary>
        [Output("productArn")]
        public Output<string> ProductArn { get; private set; } = null!;


        /// <summary>
        /// Create a ProductSubscription resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public ProductSubscription(string name, ProductSubscriptionArgs args, CustomResourceOptions? options = null)
            : base("aws:securityhub/productSubscription:ProductSubscription", name, args ?? new ProductSubscriptionArgs(), MakeResourceOptions(options, ""))
        {
        }

        private ProductSubscription(string name, Input<string> id, ProductSubscriptionState? state = null, CustomResourceOptions? options = null)
            : base("aws:securityhub/productSubscription:ProductSubscription", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing ProductSubscription resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static ProductSubscription Get(string name, Input<string> id, ProductSubscriptionState? state = null, CustomResourceOptions? options = null)
        {
            return new ProductSubscription(name, id, state, options);
        }
    }

    public sealed class ProductSubscriptionArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The ARN of the product that generates findings that you want to import into Security Hub - see below.
        /// 
        /// Amazon maintains a list of [Product integrations in AWS Security Hub](https://docs.aws.amazon.com/securityhub/latest/userguide/securityhub-findings-providers.html) that changes over time. Any of the products on the linked [Available AWS service integrations](https://docs.aws.amazon.com/securityhub/latest/userguide/securityhub-internal-providers.html) or [Available third-party partner product integrations](https://docs.aws.amazon.com/securityhub/latest/userguide/securityhub-partner-providers.html) can be configured using `aws.securityhub.ProductSubscription`.
        /// 
        /// Available products can also be listed by running the AWS CLI command `aws securityhub describe-products`.
        /// 
        /// A subset of currently available products (remember to replace `${var.region}` as appropriate) includes:
        /// 
        /// * `arn:aws:securityhub:${var.region}::product/aws/guardduty`
        /// * `arn:aws:securityhub:${var.region}::product/aws/inspector`
        /// * `arn:aws:securityhub:${var.region}::product/aws/macie`
        /// * `arn:aws:securityhub:${var.region}::product/alertlogic/althreatmanagement`
        /// * `arn:aws:securityhub:${var.region}::product/armordefense/armoranywhere`
        /// * `arn:aws:securityhub:${var.region}::product/barracuda/cloudsecurityguardian`
        /// * `arn:aws:securityhub:${var.region}::product/checkpoint/cloudguard-iaas`
        /// * `arn:aws:securityhub:${var.region}::product/checkpoint/dome9-arc`
        /// * `arn:aws:securityhub:${var.region}::product/crowdstrike/crowdstrike-falcon`
        /// * `arn:aws:securityhub:${var.region}::product/cyberark/cyberark-pta`
        /// * `arn:aws:securityhub:${var.region}::product/f5networks/f5-advanced-waf`
        /// * `arn:aws:securityhub:${var.region}::product/fortinet/fortigate`
        /// * `arn:aws:securityhub:${var.region}::product/guardicore/aws-infection-monkey`
        /// * `arn:aws:securityhub:${var.region}::product/guardicore/guardicore`
        /// * `arn:aws:securityhub:${var.region}::product/ibm/qradar-siem`
        /// * `arn:aws:securityhub:${var.region}::product/imperva/imperva-attack-analytics`
        /// * `arn:aws:securityhub:${var.region}::product/mcafee-skyhigh/mcafee-mvision-cloud-aws`
        /// * `arn:aws:securityhub:${var.region}::product/paloaltonetworks/redlock`
        /// * `arn:aws:securityhub:${var.region}::product/paloaltonetworks/vm-series`
        /// * `arn:aws:securityhub:${var.region}::product/qualys/qualys-pc`
        /// * `arn:aws:securityhub:${var.region}::product/qualys/qualys-vm`
        /// * `arn:aws:securityhub:${var.region}::product/rapid7/insightvm`
        /// * `arn:aws:securityhub:${var.region}::product/sophos/sophos-server-protection`
        /// * `arn:aws:securityhub:${var.region}::product/splunk/splunk-enterprise`
        /// * `arn:aws:securityhub:${var.region}::product/splunk/splunk-phantom`
        /// * `arn:aws:securityhub:${var.region}::product/sumologicinc/sumologic-mda`
        /// * `arn:aws:securityhub:${var.region}::product/symantec-corp/symantec-cwp`
        /// * `arn:aws:securityhub:${var.region}::product/tenable/tenable-io`
        /// * `arn:aws:securityhub:${var.region}::product/trend-micro/deep-security`
        /// * `arn:aws:securityhub:${var.region}::product/turbot/turbot`
        /// * `arn:aws:securityhub:${var.region}::product/twistlock/twistlock-enterprise`
        /// </summary>
        [Input("productArn", required: true)]
        public Input<string> ProductArn { get; set; } = null!;

        public ProductSubscriptionArgs()
        {
        }
        public static new ProductSubscriptionArgs Empty => new ProductSubscriptionArgs();
    }

    public sealed class ProductSubscriptionState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The ARN of a resource that represents your subscription to the product that generates the findings that you want to import into Security Hub.
        /// </summary>
        [Input("arn")]
        public Input<string>? Arn { get; set; }

        /// <summary>
        /// The ARN of the product that generates findings that you want to import into Security Hub - see below.
        /// 
        /// Amazon maintains a list of [Product integrations in AWS Security Hub](https://docs.aws.amazon.com/securityhub/latest/userguide/securityhub-findings-providers.html) that changes over time. Any of the products on the linked [Available AWS service integrations](https://docs.aws.amazon.com/securityhub/latest/userguide/securityhub-internal-providers.html) or [Available third-party partner product integrations](https://docs.aws.amazon.com/securityhub/latest/userguide/securityhub-partner-providers.html) can be configured using `aws.securityhub.ProductSubscription`.
        /// 
        /// Available products can also be listed by running the AWS CLI command `aws securityhub describe-products`.
        /// 
        /// A subset of currently available products (remember to replace `${var.region}` as appropriate) includes:
        /// 
        /// * `arn:aws:securityhub:${var.region}::product/aws/guardduty`
        /// * `arn:aws:securityhub:${var.region}::product/aws/inspector`
        /// * `arn:aws:securityhub:${var.region}::product/aws/macie`
        /// * `arn:aws:securityhub:${var.region}::product/alertlogic/althreatmanagement`
        /// * `arn:aws:securityhub:${var.region}::product/armordefense/armoranywhere`
        /// * `arn:aws:securityhub:${var.region}::product/barracuda/cloudsecurityguardian`
        /// * `arn:aws:securityhub:${var.region}::product/checkpoint/cloudguard-iaas`
        /// * `arn:aws:securityhub:${var.region}::product/checkpoint/dome9-arc`
        /// * `arn:aws:securityhub:${var.region}::product/crowdstrike/crowdstrike-falcon`
        /// * `arn:aws:securityhub:${var.region}::product/cyberark/cyberark-pta`
        /// * `arn:aws:securityhub:${var.region}::product/f5networks/f5-advanced-waf`
        /// * `arn:aws:securityhub:${var.region}::product/fortinet/fortigate`
        /// * `arn:aws:securityhub:${var.region}::product/guardicore/aws-infection-monkey`
        /// * `arn:aws:securityhub:${var.region}::product/guardicore/guardicore`
        /// * `arn:aws:securityhub:${var.region}::product/ibm/qradar-siem`
        /// * `arn:aws:securityhub:${var.region}::product/imperva/imperva-attack-analytics`
        /// * `arn:aws:securityhub:${var.region}::product/mcafee-skyhigh/mcafee-mvision-cloud-aws`
        /// * `arn:aws:securityhub:${var.region}::product/paloaltonetworks/redlock`
        /// * `arn:aws:securityhub:${var.region}::product/paloaltonetworks/vm-series`
        /// * `arn:aws:securityhub:${var.region}::product/qualys/qualys-pc`
        /// * `arn:aws:securityhub:${var.region}::product/qualys/qualys-vm`
        /// * `arn:aws:securityhub:${var.region}::product/rapid7/insightvm`
        /// * `arn:aws:securityhub:${var.region}::product/sophos/sophos-server-protection`
        /// * `arn:aws:securityhub:${var.region}::product/splunk/splunk-enterprise`
        /// * `arn:aws:securityhub:${var.region}::product/splunk/splunk-phantom`
        /// * `arn:aws:securityhub:${var.region}::product/sumologicinc/sumologic-mda`
        /// * `arn:aws:securityhub:${var.region}::product/symantec-corp/symantec-cwp`
        /// * `arn:aws:securityhub:${var.region}::product/tenable/tenable-io`
        /// * `arn:aws:securityhub:${var.region}::product/trend-micro/deep-security`
        /// * `arn:aws:securityhub:${var.region}::product/turbot/turbot`
        /// * `arn:aws:securityhub:${var.region}::product/twistlock/twistlock-enterprise`
        /// </summary>
        [Input("productArn")]
        public Input<string>? ProductArn { get; set; }

        public ProductSubscriptionState()
        {
        }
        public static new ProductSubscriptionState Empty => new ProductSubscriptionState();
    }
}
