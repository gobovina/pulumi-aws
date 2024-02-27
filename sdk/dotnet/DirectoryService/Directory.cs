// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.DirectoryService
{
    /// <summary>
    /// Provides a Simple or Managed Microsoft directory in AWS Directory Service.
    /// 
    /// ## Example Usage
    /// ### SimpleAD
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Aws = Pulumi.Aws;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var main = new Aws.Ec2.Vpc("main", new()
    ///     {
    ///         CidrBlock = "10.0.0.0/16",
    ///     });
    /// 
    ///     var foo = new Aws.Ec2.Subnet("foo", new()
    ///     {
    ///         VpcId = main.Id,
    ///         AvailabilityZone = "us-west-2a",
    ///         CidrBlock = "10.0.1.0/24",
    ///     });
    /// 
    ///     var barSubnet = new Aws.Ec2.Subnet("barSubnet", new()
    ///     {
    ///         VpcId = main.Id,
    ///         AvailabilityZone = "us-west-2b",
    ///         CidrBlock = "10.0.2.0/24",
    ///     });
    /// 
    ///     var barDirectory = new Aws.DirectoryService.Directory("barDirectory", new()
    ///     {
    ///         Name = "corp.notexample.com",
    ///         Password = "SuperSecretPassw0rd",
    ///         Size = "Small",
    ///         VpcSettings = new Aws.DirectoryService.Inputs.DirectoryVpcSettingsArgs
    ///         {
    ///             VpcId = main.Id,
    ///             SubnetIds = new[]
    ///             {
    ///                 foo.Id,
    ///                 barSubnet.Id,
    ///             },
    ///         },
    ///         Tags = 
    ///         {
    ///             { "Project", "foo" },
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// ### Microsoft Active Directory (MicrosoftAD)
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Aws = Pulumi.Aws;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var main = new Aws.Ec2.Vpc("main", new()
    ///     {
    ///         CidrBlock = "10.0.0.0/16",
    ///     });
    /// 
    ///     var foo = new Aws.Ec2.Subnet("foo", new()
    ///     {
    ///         VpcId = main.Id,
    ///         AvailabilityZone = "us-west-2a",
    ///         CidrBlock = "10.0.1.0/24",
    ///     });
    /// 
    ///     var barSubnet = new Aws.Ec2.Subnet("barSubnet", new()
    ///     {
    ///         VpcId = main.Id,
    ///         AvailabilityZone = "us-west-2b",
    ///         CidrBlock = "10.0.2.0/24",
    ///     });
    /// 
    ///     var barDirectory = new Aws.DirectoryService.Directory("barDirectory", new()
    ///     {
    ///         Name = "corp.notexample.com",
    ///         Password = "SuperSecretPassw0rd",
    ///         Edition = "Standard",
    ///         Type = "MicrosoftAD",
    ///         VpcSettings = new Aws.DirectoryService.Inputs.DirectoryVpcSettingsArgs
    ///         {
    ///             VpcId = main.Id,
    ///             SubnetIds = new[]
    ///             {
    ///                 foo.Id,
    ///                 barSubnet.Id,
    ///             },
    ///         },
    ///         Tags = 
    ///         {
    ///             { "Project", "foo" },
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// ### Microsoft Active Directory Connector (ADConnector)
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Aws = Pulumi.Aws;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var main = new Aws.Ec2.Vpc("main", new()
    ///     {
    ///         CidrBlock = "10.0.0.0/16",
    ///     });
    /// 
    ///     var foo = new Aws.Ec2.Subnet("foo", new()
    ///     {
    ///         VpcId = main.Id,
    ///         AvailabilityZone = "us-west-2a",
    ///         CidrBlock = "10.0.1.0/24",
    ///     });
    /// 
    ///     var bar = new Aws.Ec2.Subnet("bar", new()
    ///     {
    ///         VpcId = main.Id,
    ///         AvailabilityZone = "us-west-2b",
    ///         CidrBlock = "10.0.2.0/24",
    ///     });
    /// 
    ///     var connector = new Aws.DirectoryService.Directory("connector", new()
    ///     {
    ///         Name = "corp.notexample.com",
    ///         Password = "SuperSecretPassw0rd",
    ///         Size = "Small",
    ///         Type = "ADConnector",
    ///         ConnectSettings = new Aws.DirectoryService.Inputs.DirectoryConnectSettingsArgs
    ///         {
    ///             CustomerDnsIps = new[]
    ///             {
    ///                 "A.B.C.D",
    ///             },
    ///             CustomerUsername = "Admin",
    ///             SubnetIds = new[]
    ///             {
    ///                 foo.Id,
    ///                 bar.Id,
    ///             },
    ///             VpcId = main.Id,
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Using `pulumi import`, import DirectoryService directories using the directory `id`. For example:
    /// 
    /// ```sh
    ///  $ pulumi import aws:directoryservice/directory:Directory sample d-926724cf57
    /// ```
    /// </summary>
    [AwsResourceType("aws:directoryservice/directory:Directory")]
    public partial class Directory : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The access URL for the directory, such as `http://alias.awsapps.com`.
        /// </summary>
        [Output("accessUrl")]
        public Output<string> AccessUrl { get; private set; } = null!;

        /// <summary>
        /// The alias for the directory (must be unique amongst all aliases in AWS). Required for `enable_sso`.
        /// </summary>
        [Output("alias")]
        public Output<string> Alias { get; private set; } = null!;

        /// <summary>
        /// Connector related information about the directory. Fields documented below.
        /// </summary>
        [Output("connectSettings")]
        public Output<Outputs.DirectoryConnectSettings?> ConnectSettings { get; private set; } = null!;

        /// <summary>
        /// A textual description for the directory.
        /// </summary>
        [Output("description")]
        public Output<string?> Description { get; private set; } = null!;

        /// <summary>
        /// The number of domain controllers desired in the directory. Minimum value of `2`. Scaling of domain controllers is only supported for `MicrosoftAD` directories.
        /// </summary>
        [Output("desiredNumberOfDomainControllers")]
        public Output<int> DesiredNumberOfDomainControllers { get; private set; } = null!;

        /// <summary>
        /// A list of IP addresses of the DNS servers for the directory or connector.
        /// </summary>
        [Output("dnsIpAddresses")]
        public Output<ImmutableArray<string>> DnsIpAddresses { get; private set; } = null!;

        /// <summary>
        /// The MicrosoftAD edition (`Standard` or `Enterprise`). Defaults to `Enterprise`.
        /// </summary>
        [Output("edition")]
        public Output<string> Edition { get; private set; } = null!;

        /// <summary>
        /// Whether to enable single-sign on for the directory. Requires `alias`. Defaults to `false`.
        /// </summary>
        [Output("enableSso")]
        public Output<bool?> EnableSso { get; private set; } = null!;

        /// <summary>
        /// The fully qualified name for the directory, such as `corp.example.com`
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// The password for the directory administrator or connector user.
        /// </summary>
        [Output("password")]
        public Output<string> Password { get; private set; } = null!;

        /// <summary>
        /// The ID of the security group created by the directory.
        /// </summary>
        [Output("securityGroupId")]
        public Output<string> SecurityGroupId { get; private set; } = null!;

        /// <summary>
        /// The short name of the directory, such as `CORP`.
        /// </summary>
        [Output("shortName")]
        public Output<string> ShortName { get; private set; } = null!;

        /// <summary>
        /// (For `SimpleAD` and `ADConnector` types) The size of the directory (`Small` or `Large` are accepted values). `Large` by default.
        /// </summary>
        [Output("size")]
        public Output<string> Size { get; private set; } = null!;

        /// <summary>
        /// A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        /// </summary>
        [Output("tags")]
        public Output<ImmutableDictionary<string, string>?> Tags { get; private set; } = null!;

        /// <summary>
        /// A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        /// </summary>
        [Output("tagsAll")]
        public Output<ImmutableDictionary<string, string>> TagsAll { get; private set; } = null!;

        /// <summary>
        /// The directory type (`SimpleAD`, `ADConnector` or `MicrosoftAD` are accepted values). Defaults to `SimpleAD`.
        /// </summary>
        [Output("type")]
        public Output<string?> Type { get; private set; } = null!;

        /// <summary>
        /// VPC related information about the directory. Fields documented below.
        /// </summary>
        [Output("vpcSettings")]
        public Output<Outputs.DirectoryVpcSettings?> VpcSettings { get; private set; } = null!;


        /// <summary>
        /// Create a Directory resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Directory(string name, DirectoryArgs args, CustomResourceOptions? options = null)
            : base("aws:directoryservice/directory:Directory", name, args ?? new DirectoryArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Directory(string name, Input<string> id, DirectoryState? state = null, CustomResourceOptions? options = null)
            : base("aws:directoryservice/directory:Directory", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
                AdditionalSecretOutputs =
                {
                    "password",
                },
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing Directory resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Directory Get(string name, Input<string> id, DirectoryState? state = null, CustomResourceOptions? options = null)
        {
            return new Directory(name, id, state, options);
        }
    }

    public sealed class DirectoryArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The alias for the directory (must be unique amongst all aliases in AWS). Required for `enable_sso`.
        /// </summary>
        [Input("alias")]
        public Input<string>? Alias { get; set; }

        /// <summary>
        /// Connector related information about the directory. Fields documented below.
        /// </summary>
        [Input("connectSettings")]
        public Input<Inputs.DirectoryConnectSettingsArgs>? ConnectSettings { get; set; }

        /// <summary>
        /// A textual description for the directory.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// The number of domain controllers desired in the directory. Minimum value of `2`. Scaling of domain controllers is only supported for `MicrosoftAD` directories.
        /// </summary>
        [Input("desiredNumberOfDomainControllers")]
        public Input<int>? DesiredNumberOfDomainControllers { get; set; }

        /// <summary>
        /// The MicrosoftAD edition (`Standard` or `Enterprise`). Defaults to `Enterprise`.
        /// </summary>
        [Input("edition")]
        public Input<string>? Edition { get; set; }

        /// <summary>
        /// Whether to enable single-sign on for the directory. Requires `alias`. Defaults to `false`.
        /// </summary>
        [Input("enableSso")]
        public Input<bool>? EnableSso { get; set; }

        /// <summary>
        /// The fully qualified name for the directory, such as `corp.example.com`
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        [Input("password", required: true)]
        private Input<string>? _password;

        /// <summary>
        /// The password for the directory administrator or connector user.
        /// </summary>
        public Input<string>? Password
        {
            get => _password;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _password = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// The short name of the directory, such as `CORP`.
        /// </summary>
        [Input("shortName")]
        public Input<string>? ShortName { get; set; }

        /// <summary>
        /// (For `SimpleAD` and `ADConnector` types) The size of the directory (`Small` or `Large` are accepted values). `Large` by default.
        /// </summary>
        [Input("size")]
        public Input<string>? Size { get; set; }

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        /// </summary>
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        /// <summary>
        /// The directory type (`SimpleAD`, `ADConnector` or `MicrosoftAD` are accepted values). Defaults to `SimpleAD`.
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        /// <summary>
        /// VPC related information about the directory. Fields documented below.
        /// </summary>
        [Input("vpcSettings")]
        public Input<Inputs.DirectoryVpcSettingsArgs>? VpcSettings { get; set; }

        public DirectoryArgs()
        {
        }
        public static new DirectoryArgs Empty => new DirectoryArgs();
    }

    public sealed class DirectoryState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The access URL for the directory, such as `http://alias.awsapps.com`.
        /// </summary>
        [Input("accessUrl")]
        public Input<string>? AccessUrl { get; set; }

        /// <summary>
        /// The alias for the directory (must be unique amongst all aliases in AWS). Required for `enable_sso`.
        /// </summary>
        [Input("alias")]
        public Input<string>? Alias { get; set; }

        /// <summary>
        /// Connector related information about the directory. Fields documented below.
        /// </summary>
        [Input("connectSettings")]
        public Input<Inputs.DirectoryConnectSettingsGetArgs>? ConnectSettings { get; set; }

        /// <summary>
        /// A textual description for the directory.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// The number of domain controllers desired in the directory. Minimum value of `2`. Scaling of domain controllers is only supported for `MicrosoftAD` directories.
        /// </summary>
        [Input("desiredNumberOfDomainControllers")]
        public Input<int>? DesiredNumberOfDomainControllers { get; set; }

        [Input("dnsIpAddresses")]
        private InputList<string>? _dnsIpAddresses;

        /// <summary>
        /// A list of IP addresses of the DNS servers for the directory or connector.
        /// </summary>
        public InputList<string> DnsIpAddresses
        {
            get => _dnsIpAddresses ?? (_dnsIpAddresses = new InputList<string>());
            set => _dnsIpAddresses = value;
        }

        /// <summary>
        /// The MicrosoftAD edition (`Standard` or `Enterprise`). Defaults to `Enterprise`.
        /// </summary>
        [Input("edition")]
        public Input<string>? Edition { get; set; }

        /// <summary>
        /// Whether to enable single-sign on for the directory. Requires `alias`. Defaults to `false`.
        /// </summary>
        [Input("enableSso")]
        public Input<bool>? EnableSso { get; set; }

        /// <summary>
        /// The fully qualified name for the directory, such as `corp.example.com`
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("password")]
        private Input<string>? _password;

        /// <summary>
        /// The password for the directory administrator or connector user.
        /// </summary>
        public Input<string>? Password
        {
            get => _password;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _password = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// The ID of the security group created by the directory.
        /// </summary>
        [Input("securityGroupId")]
        public Input<string>? SecurityGroupId { get; set; }

        /// <summary>
        /// The short name of the directory, such as `CORP`.
        /// </summary>
        [Input("shortName")]
        public Input<string>? ShortName { get; set; }

        /// <summary>
        /// (For `SimpleAD` and `ADConnector` types) The size of the directory (`Small` or `Large` are accepted values). `Large` by default.
        /// </summary>
        [Input("size")]
        public Input<string>? Size { get; set; }

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        /// </summary>
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        [Input("tagsAll")]
        private InputMap<string>? _tagsAll;

        /// <summary>
        /// A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        /// </summary>
        [Obsolete(@"Please use `tags` instead.")]
        public InputMap<string> TagsAll
        {
            get => _tagsAll ?? (_tagsAll = new InputMap<string>());
            set => _tagsAll = value;
        }

        /// <summary>
        /// The directory type (`SimpleAD`, `ADConnector` or `MicrosoftAD` are accepted values). Defaults to `SimpleAD`.
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        /// <summary>
        /// VPC related information about the directory. Fields documented below.
        /// </summary>
        [Input("vpcSettings")]
        public Input<Inputs.DirectoryVpcSettingsGetArgs>? VpcSettings { get; set; }

        public DirectoryState()
        {
        }
        public static new DirectoryState Empty => new DirectoryState();
    }
}
