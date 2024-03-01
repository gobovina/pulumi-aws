// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Iot
{
    /// <summary>
    /// Adds an IoT Thing to an IoT Thing Group.
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
    ///     var example = new Aws.Iot.ThingGroupMembership("example", new()
    ///     {
    ///         ThingName = "example-thing",
    ///         ThingGroupName = "example-group",
    ///         OverrideDynamicGroup = true,
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Using `pulumi import`, import IoT Thing Group Membership using the thing group name and thing name. For example:
    /// 
    /// ```sh
    ///  $ pulumi import aws:iot/thingGroupMembership:ThingGroupMembership example thing_group_name/thing_name
    /// ```
    /// </summary>
    [AwsResourceType("aws:iot/thingGroupMembership:ThingGroupMembership")]
    public partial class ThingGroupMembership : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Override dynamic thing groups with static thing groups when 10-group limit is reached. If a thing belongs to 10 thing groups, and one or more of those groups are dynamic thing groups, adding a thing to a static group removes the thing from the last dynamic group.
        /// </summary>
        [Output("overrideDynamicGroup")]
        public Output<bool?> OverrideDynamicGroup { get; private set; } = null!;

        /// <summary>
        /// The name of the group to which you are adding a thing.
        /// </summary>
        [Output("thingGroupName")]
        public Output<string> ThingGroupName { get; private set; } = null!;

        /// <summary>
        /// The name of the thing to add to a group.
        /// </summary>
        [Output("thingName")]
        public Output<string> ThingName { get; private set; } = null!;


        /// <summary>
        /// Create a ThingGroupMembership resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public ThingGroupMembership(string name, ThingGroupMembershipArgs args, CustomResourceOptions? options = null)
            : base("aws:iot/thingGroupMembership:ThingGroupMembership", name, args ?? new ThingGroupMembershipArgs(), MakeResourceOptions(options, ""))
        {
        }

        private ThingGroupMembership(string name, Input<string> id, ThingGroupMembershipState? state = null, CustomResourceOptions? options = null)
            : base("aws:iot/thingGroupMembership:ThingGroupMembership", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing ThingGroupMembership resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static ThingGroupMembership Get(string name, Input<string> id, ThingGroupMembershipState? state = null, CustomResourceOptions? options = null)
        {
            return new ThingGroupMembership(name, id, state, options);
        }
    }

    public sealed class ThingGroupMembershipArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Override dynamic thing groups with static thing groups when 10-group limit is reached. If a thing belongs to 10 thing groups, and one or more of those groups are dynamic thing groups, adding a thing to a static group removes the thing from the last dynamic group.
        /// </summary>
        [Input("overrideDynamicGroup")]
        public Input<bool>? OverrideDynamicGroup { get; set; }

        /// <summary>
        /// The name of the group to which you are adding a thing.
        /// </summary>
        [Input("thingGroupName", required: true)]
        public Input<string> ThingGroupName { get; set; } = null!;

        /// <summary>
        /// The name of the thing to add to a group.
        /// </summary>
        [Input("thingName", required: true)]
        public Input<string> ThingName { get; set; } = null!;

        public ThingGroupMembershipArgs()
        {
        }
        public static new ThingGroupMembershipArgs Empty => new ThingGroupMembershipArgs();
    }

    public sealed class ThingGroupMembershipState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Override dynamic thing groups with static thing groups when 10-group limit is reached. If a thing belongs to 10 thing groups, and one or more of those groups are dynamic thing groups, adding a thing to a static group removes the thing from the last dynamic group.
        /// </summary>
        [Input("overrideDynamicGroup")]
        public Input<bool>? OverrideDynamicGroup { get; set; }

        /// <summary>
        /// The name of the group to which you are adding a thing.
        /// </summary>
        [Input("thingGroupName")]
        public Input<string>? ThingGroupName { get; set; }

        /// <summary>
        /// The name of the thing to add to a group.
        /// </summary>
        [Input("thingName")]
        public Input<string>? ThingName { get; set; }

        public ThingGroupMembershipState()
        {
        }
        public static new ThingGroupMembershipState Empty => new ThingGroupMembershipState();
    }
}
