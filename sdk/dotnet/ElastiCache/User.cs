// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.ElastiCache
{
    /// <summary>
    /// Provides an ElastiCache user resource.
    /// 
    /// &gt; **Note:** All arguments including the username and passwords will be stored in the raw state as plain-text.
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
    ///     var test = new Aws.ElastiCache.User("test", new()
    ///     {
    ///         AccessString = "on ~app::* -@all +@read +@hash +@bitmap +@geo -setbit -bitfield -hset -hsetnx -hmset -hincrby -hincrbyfloat -hdel -bitop -geoadd -georadius -georadiusbymember",
    ///         Engine = "REDIS",
    ///         Passwords = new[]
    ///         {
    ///             "password123456789",
    ///         },
    ///         UserId = "testUserId",
    ///         UserName = "testUserName",
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Aws = Pulumi.Aws;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var test = new Aws.ElastiCache.User("test", new()
    ///     {
    ///         AccessString = "on ~* +@all",
    ///         AuthenticationMode = new Aws.ElastiCache.Inputs.UserAuthenticationModeArgs
    ///         {
    ///             Type = "iam",
    ///         },
    ///         Engine = "REDIS",
    ///         UserId = "testUserId",
    ///         UserName = "testUserName",
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Aws = Pulumi.Aws;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var test = new Aws.ElastiCache.User("test", new()
    ///     {
    ///         AccessString = "on ~* +@all",
    ///         AuthenticationMode = new Aws.ElastiCache.Inputs.UserAuthenticationModeArgs
    ///         {
    ///             Passwords = new[]
    ///             {
    ///                 "password1",
    ///                 "password2",
    ///             },
    ///             Type = "password",
    ///         },
    ///         Engine = "REDIS",
    ///         UserId = "testUserId",
    ///         UserName = "testUserName",
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Using `pulumi import`, import ElastiCache users using the `user_id`. For example:
    /// 
    /// ```sh
    ///  $ pulumi import aws:elasticache/user:User my_user userId1
    /// ```
    /// </summary>
    [AwsResourceType("aws:elasticache/user:User")]
    public partial class User : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Access permissions string used for this user. See [Specifying Permissions Using an Access String](https://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/Clusters.RBAC.html#Access-string) for more details.
        /// </summary>
        [Output("accessString")]
        public Output<string> AccessString { get; private set; } = null!;

        /// <summary>
        /// The ARN of the created ElastiCache User.
        /// </summary>
        [Output("arn")]
        public Output<string> Arn { get; private set; } = null!;

        /// <summary>
        /// Denotes the user's authentication properties. Detailed below.
        /// </summary>
        [Output("authenticationMode")]
        public Output<Outputs.UserAuthenticationMode> AuthenticationMode { get; private set; } = null!;

        /// <summary>
        /// The current supported value is `REDIS`.
        /// </summary>
        [Output("engine")]
        public Output<string> Engine { get; private set; } = null!;

        /// <summary>
        /// Indicates a password is not required for this user.
        /// </summary>
        [Output("noPasswordRequired")]
        public Output<bool?> NoPasswordRequired { get; private set; } = null!;

        /// <summary>
        /// Passwords used for this user. You can create up to two passwords for each user.
        /// </summary>
        [Output("passwords")]
        public Output<ImmutableArray<string>> Passwords { get; private set; } = null!;

        /// <summary>
        /// A list of tags to be added to this resource. A tag is a key-value pair.
        /// </summary>
        [Output("tags")]
        public Output<ImmutableDictionary<string, string>?> Tags { get; private set; } = null!;

        [Output("tagsAll")]
        public Output<ImmutableDictionary<string, string>> TagsAll { get; private set; } = null!;

        /// <summary>
        /// The ID of the user.
        /// </summary>
        [Output("userId")]
        public Output<string> UserId { get; private set; } = null!;

        /// <summary>
        /// The username of the user.
        /// 
        /// The following arguments are optional:
        /// </summary>
        [Output("userName")]
        public Output<string> UserName { get; private set; } = null!;


        /// <summary>
        /// Create a User resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public User(string name, UserArgs args, CustomResourceOptions? options = null)
            : base("aws:elasticache/user:User", name, args ?? new UserArgs(), MakeResourceOptions(options, ""))
        {
        }

        private User(string name, Input<string> id, UserState? state = null, CustomResourceOptions? options = null)
            : base("aws:elasticache/user:User", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
                AdditionalSecretOutputs =
                {
                    "passwords",
                },
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing User resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static User Get(string name, Input<string> id, UserState? state = null, CustomResourceOptions? options = null)
        {
            return new User(name, id, state, options);
        }
    }

    public sealed class UserArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Access permissions string used for this user. See [Specifying Permissions Using an Access String](https://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/Clusters.RBAC.html#Access-string) for more details.
        /// </summary>
        [Input("accessString", required: true)]
        public Input<string> AccessString { get; set; } = null!;

        /// <summary>
        /// Denotes the user's authentication properties. Detailed below.
        /// </summary>
        [Input("authenticationMode")]
        public Input<Inputs.UserAuthenticationModeArgs>? AuthenticationMode { get; set; }

        /// <summary>
        /// The current supported value is `REDIS`.
        /// </summary>
        [Input("engine", required: true)]
        public Input<string> Engine { get; set; } = null!;

        /// <summary>
        /// Indicates a password is not required for this user.
        /// </summary>
        [Input("noPasswordRequired")]
        public Input<bool>? NoPasswordRequired { get; set; }

        [Input("passwords")]
        private InputList<string>? _passwords;

        /// <summary>
        /// Passwords used for this user. You can create up to two passwords for each user.
        /// </summary>
        public InputList<string> Passwords
        {
            get => _passwords ?? (_passwords = new InputList<string>());
            set
            {
                var emptySecret = Output.CreateSecret(ImmutableArray.Create<string>());
                _passwords = Output.All(value, emptySecret).Apply(v => v[0]);
            }
        }

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// A list of tags to be added to this resource. A tag is a key-value pair.
        /// </summary>
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        /// <summary>
        /// The ID of the user.
        /// </summary>
        [Input("userId", required: true)]
        public Input<string> UserId { get; set; } = null!;

        /// <summary>
        /// The username of the user.
        /// 
        /// The following arguments are optional:
        /// </summary>
        [Input("userName", required: true)]
        public Input<string> UserName { get; set; } = null!;

        public UserArgs()
        {
        }
        public static new UserArgs Empty => new UserArgs();
    }

    public sealed class UserState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Access permissions string used for this user. See [Specifying Permissions Using an Access String](https://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/Clusters.RBAC.html#Access-string) for more details.
        /// </summary>
        [Input("accessString")]
        public Input<string>? AccessString { get; set; }

        /// <summary>
        /// The ARN of the created ElastiCache User.
        /// </summary>
        [Input("arn")]
        public Input<string>? Arn { get; set; }

        /// <summary>
        /// Denotes the user's authentication properties. Detailed below.
        /// </summary>
        [Input("authenticationMode")]
        public Input<Inputs.UserAuthenticationModeGetArgs>? AuthenticationMode { get; set; }

        /// <summary>
        /// The current supported value is `REDIS`.
        /// </summary>
        [Input("engine")]
        public Input<string>? Engine { get; set; }

        /// <summary>
        /// Indicates a password is not required for this user.
        /// </summary>
        [Input("noPasswordRequired")]
        public Input<bool>? NoPasswordRequired { get; set; }

        [Input("passwords")]
        private InputList<string>? _passwords;

        /// <summary>
        /// Passwords used for this user. You can create up to two passwords for each user.
        /// </summary>
        public InputList<string> Passwords
        {
            get => _passwords ?? (_passwords = new InputList<string>());
            set
            {
                var emptySecret = Output.CreateSecret(ImmutableArray.Create<string>());
                _passwords = Output.All(value, emptySecret).Apply(v => v[0]);
            }
        }

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// A list of tags to be added to this resource. A tag is a key-value pair.
        /// </summary>
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        [Input("tagsAll")]
        private InputMap<string>? _tagsAll;
        public InputMap<string> TagsAll
        {
            get => _tagsAll ?? (_tagsAll = new InputMap<string>());
            set => _tagsAll = value;
        }

        /// <summary>
        /// The ID of the user.
        /// </summary>
        [Input("userId")]
        public Input<string>? UserId { get; set; }

        /// <summary>
        /// The username of the user.
        /// 
        /// The following arguments are optional:
        /// </summary>
        [Input("userName")]
        public Input<string>? UserName { get; set; }

        public UserState()
        {
        }
        public static new UserState Empty => new UserState();
    }
}
