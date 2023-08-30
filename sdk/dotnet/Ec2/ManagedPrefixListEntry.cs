// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Ec2
{
    /// <summary>
    /// Use the `aws_prefix_list_entry` resource to manage a managed prefix list entry.
    /// 
    /// &gt; **NOTE:** Pulumi currently provides two resources for managing Managed Prefix Lists and Managed Prefix List Entries. The standalone resource, Managed Prefix List Entry, is used to manage a single entry. The Managed Prefix List resource is used to manage multiple entries defined in-line. It is important to note that you cannot use a Managed Prefix List with in-line rules in conjunction with any Managed Prefix List Entry resources. This will result in a conflict of entries and will cause the entries to be overwritten.
    /// 
    /// &gt; **NOTE:** To improve execution times on larger updates, it is recommended to use the inline `entry` block as part of the Managed Prefix List resource when creating a prefix list with more than 100 entries. You can find more information about the resource here.
    /// 
    /// ## Example Usage
    /// 
    /// Basic usage.
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Aws = Pulumi.Aws;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var example = new Aws.Ec2.ManagedPrefixList("example", new()
    ///     {
    ///         AddressFamily = "IPv4",
    ///         MaxEntries = 5,
    ///         Tags = 
    ///         {
    ///             { "Env", "live" },
    ///         },
    ///     });
    /// 
    ///     var entry1 = new Aws.Ec2.ManagedPrefixListEntry("entry1", new()
    ///     {
    ///         Cidr = aws_vpc.Example.Cidr_block,
    ///         Description = "Primary",
    ///         PrefixListId = example.Id,
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Using `pulumi import`, import prefix list entries using `prefix_list_id` and `cidr` separated by a comma (`,`). For example:
    /// 
    /// ```sh
    ///  $ pulumi import aws:ec2/managedPrefixListEntry:ManagedPrefixListEntry default pl-0570a1d2d725c16be,10.0.3.0/24
    /// ```
    /// </summary>
    [AwsResourceType("aws:ec2/managedPrefixListEntry:ManagedPrefixListEntry")]
    public partial class ManagedPrefixListEntry : global::Pulumi.CustomResource
    {
        /// <summary>
        /// CIDR block of this entry.
        /// </summary>
        [Output("cidr")]
        public Output<string> Cidr { get; private set; } = null!;

        /// <summary>
        /// Description of this entry. Please note that due to API limitations, updating only the description of an entry will require recreating the entry.
        /// </summary>
        [Output("description")]
        public Output<string?> Description { get; private set; } = null!;

        /// <summary>
        /// CIDR block of this entry.
        /// </summary>
        [Output("prefixListId")]
        public Output<string> PrefixListId { get; private set; } = null!;


        /// <summary>
        /// Create a ManagedPrefixListEntry resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public ManagedPrefixListEntry(string name, ManagedPrefixListEntryArgs args, CustomResourceOptions? options = null)
            : base("aws:ec2/managedPrefixListEntry:ManagedPrefixListEntry", name, args ?? new ManagedPrefixListEntryArgs(), MakeResourceOptions(options, ""))
        {
        }

        private ManagedPrefixListEntry(string name, Input<string> id, ManagedPrefixListEntryState? state = null, CustomResourceOptions? options = null)
            : base("aws:ec2/managedPrefixListEntry:ManagedPrefixListEntry", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing ManagedPrefixListEntry resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static ManagedPrefixListEntry Get(string name, Input<string> id, ManagedPrefixListEntryState? state = null, CustomResourceOptions? options = null)
        {
            return new ManagedPrefixListEntry(name, id, state, options);
        }
    }

    public sealed class ManagedPrefixListEntryArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// CIDR block of this entry.
        /// </summary>
        [Input("cidr", required: true)]
        public Input<string> Cidr { get; set; } = null!;

        /// <summary>
        /// Description of this entry. Please note that due to API limitations, updating only the description of an entry will require recreating the entry.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// CIDR block of this entry.
        /// </summary>
        [Input("prefixListId", required: true)]
        public Input<string> PrefixListId { get; set; } = null!;

        public ManagedPrefixListEntryArgs()
        {
        }
        public static new ManagedPrefixListEntryArgs Empty => new ManagedPrefixListEntryArgs();
    }

    public sealed class ManagedPrefixListEntryState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// CIDR block of this entry.
        /// </summary>
        [Input("cidr")]
        public Input<string>? Cidr { get; set; }

        /// <summary>
        /// Description of this entry. Please note that due to API limitations, updating only the description of an entry will require recreating the entry.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// CIDR block of this entry.
        /// </summary>
        [Input("prefixListId")]
        public Input<string>? PrefixListId { get; set; }

        public ManagedPrefixListEntryState()
        {
        }
        public static new ManagedPrefixListEntryState Empty => new ManagedPrefixListEntryState();
    }
}
