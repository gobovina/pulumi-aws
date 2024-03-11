# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities
from . import outputs
from ._inputs import *

__all__ = ['OptionGroupArgs', 'OptionGroup']

@pulumi.input_type
class OptionGroupArgs:
    def __init__(__self__, *,
                 engine_name: pulumi.Input[str],
                 major_engine_version: pulumi.Input[str],
                 name: Optional[pulumi.Input[str]] = None,
                 name_prefix: Optional[pulumi.Input[str]] = None,
                 option_group_description: Optional[pulumi.Input[str]] = None,
                 options: Optional[pulumi.Input[Sequence[pulumi.Input['OptionGroupOptionArgs']]]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None):
        """
        The set of arguments for constructing a OptionGroup resource.
        :param pulumi.Input[str] engine_name: Specifies the name of the engine that this option group should be associated with.
        :param pulumi.Input[str] major_engine_version: Specifies the major version of the engine that this option group should be associated with.
        :param pulumi.Input[str] name: Name of the option group. If omitted, the provider will assign a random, unique name. Must be lowercase, to match as it is stored in AWS.
        :param pulumi.Input[str] name_prefix: Creates a unique name beginning with the specified prefix. Conflicts with `name`. Must be lowercase, to match as it is stored in AWS.
        :param pulumi.Input[str] option_group_description: Description of the option group.
        :param pulumi.Input[Sequence[pulumi.Input['OptionGroupOptionArgs']]] options: The options to apply. See `option` Block below for more details.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: Map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        """
        pulumi.set(__self__, "engine_name", engine_name)
        pulumi.set(__self__, "major_engine_version", major_engine_version)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if name_prefix is not None:
            pulumi.set(__self__, "name_prefix", name_prefix)
        if option_group_description is None:
            option_group_description = 'Managed by Pulumi'
        if option_group_description is not None:
            pulumi.set(__self__, "option_group_description", option_group_description)
        if options is not None:
            pulumi.set(__self__, "options", options)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)

    @property
    @pulumi.getter(name="engineName")
    def engine_name(self) -> pulumi.Input[str]:
        """
        Specifies the name of the engine that this option group should be associated with.
        """
        return pulumi.get(self, "engine_name")

    @engine_name.setter
    def engine_name(self, value: pulumi.Input[str]):
        pulumi.set(self, "engine_name", value)

    @property
    @pulumi.getter(name="majorEngineVersion")
    def major_engine_version(self) -> pulumi.Input[str]:
        """
        Specifies the major version of the engine that this option group should be associated with.
        """
        return pulumi.get(self, "major_engine_version")

    @major_engine_version.setter
    def major_engine_version(self, value: pulumi.Input[str]):
        pulumi.set(self, "major_engine_version", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        Name of the option group. If omitted, the provider will assign a random, unique name. Must be lowercase, to match as it is stored in AWS.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="namePrefix")
    def name_prefix(self) -> Optional[pulumi.Input[str]]:
        """
        Creates a unique name beginning with the specified prefix. Conflicts with `name`. Must be lowercase, to match as it is stored in AWS.
        """
        return pulumi.get(self, "name_prefix")

    @name_prefix.setter
    def name_prefix(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name_prefix", value)

    @property
    @pulumi.getter(name="optionGroupDescription")
    def option_group_description(self) -> Optional[pulumi.Input[str]]:
        """
        Description of the option group.
        """
        return pulumi.get(self, "option_group_description")

    @option_group_description.setter
    def option_group_description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "option_group_description", value)

    @property
    @pulumi.getter
    def options(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['OptionGroupOptionArgs']]]]:
        """
        The options to apply. See `option` Block below for more details.
        """
        return pulumi.get(self, "options")

    @options.setter
    def options(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['OptionGroupOptionArgs']]]]):
        pulumi.set(self, "options", value)

    @property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        Map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        """
        return pulumi.get(self, "tags")

    @tags.setter
    def tags(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "tags", value)


@pulumi.input_type
class _OptionGroupState:
    def __init__(__self__, *,
                 arn: Optional[pulumi.Input[str]] = None,
                 engine_name: Optional[pulumi.Input[str]] = None,
                 major_engine_version: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 name_prefix: Optional[pulumi.Input[str]] = None,
                 option_group_description: Optional[pulumi.Input[str]] = None,
                 options: Optional[pulumi.Input[Sequence[pulumi.Input['OptionGroupOptionArgs']]]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 tags_all: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None):
        """
        Input properties used for looking up and filtering OptionGroup resources.
        :param pulumi.Input[str] arn: ARN of the DB option group.
        :param pulumi.Input[str] engine_name: Specifies the name of the engine that this option group should be associated with.
        :param pulumi.Input[str] major_engine_version: Specifies the major version of the engine that this option group should be associated with.
        :param pulumi.Input[str] name: Name of the option group. If omitted, the provider will assign a random, unique name. Must be lowercase, to match as it is stored in AWS.
        :param pulumi.Input[str] name_prefix: Creates a unique name beginning with the specified prefix. Conflicts with `name`. Must be lowercase, to match as it is stored in AWS.
        :param pulumi.Input[str] option_group_description: Description of the option group.
        :param pulumi.Input[Sequence[pulumi.Input['OptionGroupOptionArgs']]] options: The options to apply. See `option` Block below for more details.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: Map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags_all: Map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        """
        if arn is not None:
            pulumi.set(__self__, "arn", arn)
        if engine_name is not None:
            pulumi.set(__self__, "engine_name", engine_name)
        if major_engine_version is not None:
            pulumi.set(__self__, "major_engine_version", major_engine_version)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if name_prefix is not None:
            pulumi.set(__self__, "name_prefix", name_prefix)
        if option_group_description is None:
            option_group_description = 'Managed by Pulumi'
        if option_group_description is not None:
            pulumi.set(__self__, "option_group_description", option_group_description)
        if options is not None:
            pulumi.set(__self__, "options", options)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)
        if tags_all is not None:
            warnings.warn("""Please use `tags` instead.""", DeprecationWarning)
            pulumi.log.warn("""tags_all is deprecated: Please use `tags` instead.""")
        if tags_all is not None:
            pulumi.set(__self__, "tags_all", tags_all)

    @property
    @pulumi.getter
    def arn(self) -> Optional[pulumi.Input[str]]:
        """
        ARN of the DB option group.
        """
        return pulumi.get(self, "arn")

    @arn.setter
    def arn(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "arn", value)

    @property
    @pulumi.getter(name="engineName")
    def engine_name(self) -> Optional[pulumi.Input[str]]:
        """
        Specifies the name of the engine that this option group should be associated with.
        """
        return pulumi.get(self, "engine_name")

    @engine_name.setter
    def engine_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "engine_name", value)

    @property
    @pulumi.getter(name="majorEngineVersion")
    def major_engine_version(self) -> Optional[pulumi.Input[str]]:
        """
        Specifies the major version of the engine that this option group should be associated with.
        """
        return pulumi.get(self, "major_engine_version")

    @major_engine_version.setter
    def major_engine_version(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "major_engine_version", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        Name of the option group. If omitted, the provider will assign a random, unique name. Must be lowercase, to match as it is stored in AWS.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="namePrefix")
    def name_prefix(self) -> Optional[pulumi.Input[str]]:
        """
        Creates a unique name beginning with the specified prefix. Conflicts with `name`. Must be lowercase, to match as it is stored in AWS.
        """
        return pulumi.get(self, "name_prefix")

    @name_prefix.setter
    def name_prefix(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name_prefix", value)

    @property
    @pulumi.getter(name="optionGroupDescription")
    def option_group_description(self) -> Optional[pulumi.Input[str]]:
        """
        Description of the option group.
        """
        return pulumi.get(self, "option_group_description")

    @option_group_description.setter
    def option_group_description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "option_group_description", value)

    @property
    @pulumi.getter
    def options(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['OptionGroupOptionArgs']]]]:
        """
        The options to apply. See `option` Block below for more details.
        """
        return pulumi.get(self, "options")

    @options.setter
    def options(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['OptionGroupOptionArgs']]]]):
        pulumi.set(self, "options", value)

    @property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        Map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        """
        return pulumi.get(self, "tags")

    @tags.setter
    def tags(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "tags", value)

    @property
    @pulumi.getter(name="tagsAll")
    def tags_all(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        Map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        """
        warnings.warn("""Please use `tags` instead.""", DeprecationWarning)
        pulumi.log.warn("""tags_all is deprecated: Please use `tags` instead.""")

        return pulumi.get(self, "tags_all")

    @tags_all.setter
    def tags_all(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "tags_all", value)


class OptionGroup(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 engine_name: Optional[pulumi.Input[str]] = None,
                 major_engine_version: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 name_prefix: Optional[pulumi.Input[str]] = None,
                 option_group_description: Optional[pulumi.Input[str]] = None,
                 options: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['OptionGroupOptionArgs']]]]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 __props__=None):
        """
        Provides an RDS DB option group resource. Documentation of the available options for various RDS engines can be found at:

        * [MariaDB Options](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Appendix.MariaDB.Options.html)
        * [Microsoft SQL Server Options](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Appendix.SQLServer.Options.html)
        * [MySQL Options](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Appendix.MySQL.Options.html)
        * [Oracle Options](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Appendix.Oracle.Options.html)

        ## Example Usage

        <!--Start PulumiCodeChooser -->
        ```python
        import pulumi
        import pulumi_aws as aws

        example = aws.rds.OptionGroup("example",
            name="option-group-test",
            option_group_description="Option Group",
            engine_name="sqlserver-ee",
            major_engine_version="11.00",
            options=[
                aws.rds.OptionGroupOptionArgs(
                    option_name="Timezone",
                    option_settings=[aws.rds.OptionGroupOptionOptionSettingArgs(
                        name="TIME_ZONE",
                        value="UTC",
                    )],
                ),
                aws.rds.OptionGroupOptionArgs(
                    option_name="SQLSERVER_BACKUP_RESTORE",
                    option_settings=[aws.rds.OptionGroupOptionOptionSettingArgs(
                        name="IAM_ROLE_ARN",
                        value=example_aws_iam_role["arn"],
                    )],
                ),
                aws.rds.OptionGroupOptionArgs(
                    option_name="TDE",
                ),
            ])
        ```
        <!--End PulumiCodeChooser -->

        > **Note:** Any modifications to the `rds.OptionGroup` are set to happen immediately as we default to applying immediately.

        > **WARNING:** You can perform a destroy on a `rds.OptionGroup`, as long as it is not associated with any Amazon RDS resource. An option group can be associated with a DB instance, a manual DB snapshot, or an automated DB snapshot.

        If you try to delete an option group that is associated with an Amazon RDS resource, an error similar to the following is returned:

        > An error occurred (InvalidOptionGroupStateFault) when calling the DeleteOptionGroup operation: The option group 'optionGroupName' cannot be deleted because it is in use.

        More information about this can be found [here](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_WorkingWithOptionGroups.html#USER_WorkingWithOptionGroups.Delete).

        ## Import

        Using `pulumi import`, import DB option groups using the `name`. For example:

        ```sh
        $ pulumi import aws:rds/optionGroup:OptionGroup example mysql-option-group
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] engine_name: Specifies the name of the engine that this option group should be associated with.
        :param pulumi.Input[str] major_engine_version: Specifies the major version of the engine that this option group should be associated with.
        :param pulumi.Input[str] name: Name of the option group. If omitted, the provider will assign a random, unique name. Must be lowercase, to match as it is stored in AWS.
        :param pulumi.Input[str] name_prefix: Creates a unique name beginning with the specified prefix. Conflicts with `name`. Must be lowercase, to match as it is stored in AWS.
        :param pulumi.Input[str] option_group_description: Description of the option group.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['OptionGroupOptionArgs']]]] options: The options to apply. See `option` Block below for more details.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: Map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: OptionGroupArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides an RDS DB option group resource. Documentation of the available options for various RDS engines can be found at:

        * [MariaDB Options](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Appendix.MariaDB.Options.html)
        * [Microsoft SQL Server Options](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Appendix.SQLServer.Options.html)
        * [MySQL Options](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Appendix.MySQL.Options.html)
        * [Oracle Options](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Appendix.Oracle.Options.html)

        ## Example Usage

        <!--Start PulumiCodeChooser -->
        ```python
        import pulumi
        import pulumi_aws as aws

        example = aws.rds.OptionGroup("example",
            name="option-group-test",
            option_group_description="Option Group",
            engine_name="sqlserver-ee",
            major_engine_version="11.00",
            options=[
                aws.rds.OptionGroupOptionArgs(
                    option_name="Timezone",
                    option_settings=[aws.rds.OptionGroupOptionOptionSettingArgs(
                        name="TIME_ZONE",
                        value="UTC",
                    )],
                ),
                aws.rds.OptionGroupOptionArgs(
                    option_name="SQLSERVER_BACKUP_RESTORE",
                    option_settings=[aws.rds.OptionGroupOptionOptionSettingArgs(
                        name="IAM_ROLE_ARN",
                        value=example_aws_iam_role["arn"],
                    )],
                ),
                aws.rds.OptionGroupOptionArgs(
                    option_name="TDE",
                ),
            ])
        ```
        <!--End PulumiCodeChooser -->

        > **Note:** Any modifications to the `rds.OptionGroup` are set to happen immediately as we default to applying immediately.

        > **WARNING:** You can perform a destroy on a `rds.OptionGroup`, as long as it is not associated with any Amazon RDS resource. An option group can be associated with a DB instance, a manual DB snapshot, or an automated DB snapshot.

        If you try to delete an option group that is associated with an Amazon RDS resource, an error similar to the following is returned:

        > An error occurred (InvalidOptionGroupStateFault) when calling the DeleteOptionGroup operation: The option group 'optionGroupName' cannot be deleted because it is in use.

        More information about this can be found [here](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_WorkingWithOptionGroups.html#USER_WorkingWithOptionGroups.Delete).

        ## Import

        Using `pulumi import`, import DB option groups using the `name`. For example:

        ```sh
        $ pulumi import aws:rds/optionGroup:OptionGroup example mysql-option-group
        ```

        :param str resource_name: The name of the resource.
        :param OptionGroupArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(OptionGroupArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 engine_name: Optional[pulumi.Input[str]] = None,
                 major_engine_version: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 name_prefix: Optional[pulumi.Input[str]] = None,
                 option_group_description: Optional[pulumi.Input[str]] = None,
                 options: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['OptionGroupOptionArgs']]]]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = OptionGroupArgs.__new__(OptionGroupArgs)

            if engine_name is None and not opts.urn:
                raise TypeError("Missing required property 'engine_name'")
            __props__.__dict__["engine_name"] = engine_name
            if major_engine_version is None and not opts.urn:
                raise TypeError("Missing required property 'major_engine_version'")
            __props__.__dict__["major_engine_version"] = major_engine_version
            __props__.__dict__["name"] = name
            __props__.__dict__["name_prefix"] = name_prefix
            if option_group_description is None:
                option_group_description = 'Managed by Pulumi'
            __props__.__dict__["option_group_description"] = option_group_description
            __props__.__dict__["options"] = options
            __props__.__dict__["tags"] = tags
            __props__.__dict__["arn"] = None
            __props__.__dict__["tags_all"] = None
        super(OptionGroup, __self__).__init__(
            'aws:rds/optionGroup:OptionGroup',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            arn: Optional[pulumi.Input[str]] = None,
            engine_name: Optional[pulumi.Input[str]] = None,
            major_engine_version: Optional[pulumi.Input[str]] = None,
            name: Optional[pulumi.Input[str]] = None,
            name_prefix: Optional[pulumi.Input[str]] = None,
            option_group_description: Optional[pulumi.Input[str]] = None,
            options: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['OptionGroupOptionArgs']]]]] = None,
            tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
            tags_all: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None) -> 'OptionGroup':
        """
        Get an existing OptionGroup resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] arn: ARN of the DB option group.
        :param pulumi.Input[str] engine_name: Specifies the name of the engine that this option group should be associated with.
        :param pulumi.Input[str] major_engine_version: Specifies the major version of the engine that this option group should be associated with.
        :param pulumi.Input[str] name: Name of the option group. If omitted, the provider will assign a random, unique name. Must be lowercase, to match as it is stored in AWS.
        :param pulumi.Input[str] name_prefix: Creates a unique name beginning with the specified prefix. Conflicts with `name`. Must be lowercase, to match as it is stored in AWS.
        :param pulumi.Input[str] option_group_description: Description of the option group.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['OptionGroupOptionArgs']]]] options: The options to apply. See `option` Block below for more details.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: Map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags_all: Map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _OptionGroupState.__new__(_OptionGroupState)

        __props__.__dict__["arn"] = arn
        __props__.__dict__["engine_name"] = engine_name
        __props__.__dict__["major_engine_version"] = major_engine_version
        __props__.__dict__["name"] = name
        __props__.__dict__["name_prefix"] = name_prefix
        __props__.__dict__["option_group_description"] = option_group_description
        __props__.__dict__["options"] = options
        __props__.__dict__["tags"] = tags
        __props__.__dict__["tags_all"] = tags_all
        return OptionGroup(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def arn(self) -> pulumi.Output[str]:
        """
        ARN of the DB option group.
        """
        return pulumi.get(self, "arn")

    @property
    @pulumi.getter(name="engineName")
    def engine_name(self) -> pulumi.Output[str]:
        """
        Specifies the name of the engine that this option group should be associated with.
        """
        return pulumi.get(self, "engine_name")

    @property
    @pulumi.getter(name="majorEngineVersion")
    def major_engine_version(self) -> pulumi.Output[str]:
        """
        Specifies the major version of the engine that this option group should be associated with.
        """
        return pulumi.get(self, "major_engine_version")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        Name of the option group. If omitted, the provider will assign a random, unique name. Must be lowercase, to match as it is stored in AWS.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="namePrefix")
    def name_prefix(self) -> pulumi.Output[str]:
        """
        Creates a unique name beginning with the specified prefix. Conflicts with `name`. Must be lowercase, to match as it is stored in AWS.
        """
        return pulumi.get(self, "name_prefix")

    @property
    @pulumi.getter(name="optionGroupDescription")
    def option_group_description(self) -> pulumi.Output[str]:
        """
        Description of the option group.
        """
        return pulumi.get(self, "option_group_description")

    @property
    @pulumi.getter
    def options(self) -> pulumi.Output[Optional[Sequence['outputs.OptionGroupOption']]]:
        """
        The options to apply. See `option` Block below for more details.
        """
        return pulumi.get(self, "options")

    @property
    @pulumi.getter
    def tags(self) -> pulumi.Output[Optional[Mapping[str, str]]]:
        """
        Map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        """
        return pulumi.get(self, "tags")

    @property
    @pulumi.getter(name="tagsAll")
    def tags_all(self) -> pulumi.Output[Mapping[str, str]]:
        """
        Map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        """
        warnings.warn("""Please use `tags` instead.""", DeprecationWarning)
        pulumi.log.warn("""tags_all is deprecated: Please use `tags` instead.""")

        return pulumi.get(self, "tags_all")

