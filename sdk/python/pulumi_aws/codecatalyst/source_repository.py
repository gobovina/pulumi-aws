# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = ['SourceRepositoryArgs', 'SourceRepository']

@pulumi.input_type
class SourceRepositoryArgs:
    def __init__(__self__, *,
                 project_name: pulumi.Input[str],
                 space_name: pulumi.Input[str],
                 description: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a SourceRepository resource.
        :param pulumi.Input[str] project_name: The name of the project in the CodeCatalyst space.
               
               The following arguments are optional:
        :param pulumi.Input[str] space_name: The name of the CodeCatalyst space.
        :param pulumi.Input[str] description: The description of the project. This description will be displayed to all users of the project. We recommend providing a brief description of the project and its intended purpose.
        :param pulumi.Input[str] name: The name of the source repository. For more information about name requirements, see [Quotas for source repositories](https://docs.aws.amazon.com/codecatalyst/latest/userguide/source-quotas.html).
        """
        pulumi.set(__self__, "project_name", project_name)
        pulumi.set(__self__, "space_name", space_name)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if name is not None:
            pulumi.set(__self__, "name", name)

    @property
    @pulumi.getter(name="projectName")
    def project_name(self) -> pulumi.Input[str]:
        """
        The name of the project in the CodeCatalyst space.

        The following arguments are optional:
        """
        return pulumi.get(self, "project_name")

    @project_name.setter
    def project_name(self, value: pulumi.Input[str]):
        pulumi.set(self, "project_name", value)

    @property
    @pulumi.getter(name="spaceName")
    def space_name(self) -> pulumi.Input[str]:
        """
        The name of the CodeCatalyst space.
        """
        return pulumi.get(self, "space_name")

    @space_name.setter
    def space_name(self, value: pulumi.Input[str]):
        pulumi.set(self, "space_name", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        The description of the project. This description will be displayed to all users of the project. We recommend providing a brief description of the project and its intended purpose.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the source repository. For more information about name requirements, see [Quotas for source repositories](https://docs.aws.amazon.com/codecatalyst/latest/userguide/source-quotas.html).
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)


@pulumi.input_type
class _SourceRepositoryState:
    def __init__(__self__, *,
                 description: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 project_name: Optional[pulumi.Input[str]] = None,
                 space_name: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering SourceRepository resources.
        :param pulumi.Input[str] description: The description of the project. This description will be displayed to all users of the project. We recommend providing a brief description of the project and its intended purpose.
        :param pulumi.Input[str] name: The name of the source repository. For more information about name requirements, see [Quotas for source repositories](https://docs.aws.amazon.com/codecatalyst/latest/userguide/source-quotas.html).
        :param pulumi.Input[str] project_name: The name of the project in the CodeCatalyst space.
               
               The following arguments are optional:
        :param pulumi.Input[str] space_name: The name of the CodeCatalyst space.
        """
        if description is not None:
            pulumi.set(__self__, "description", description)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if project_name is not None:
            pulumi.set(__self__, "project_name", project_name)
        if space_name is not None:
            pulumi.set(__self__, "space_name", space_name)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        The description of the project. This description will be displayed to all users of the project. We recommend providing a brief description of the project and its intended purpose.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the source repository. For more information about name requirements, see [Quotas for source repositories](https://docs.aws.amazon.com/codecatalyst/latest/userguide/source-quotas.html).
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="projectName")
    def project_name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the project in the CodeCatalyst space.

        The following arguments are optional:
        """
        return pulumi.get(self, "project_name")

    @project_name.setter
    def project_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "project_name", value)

    @property
    @pulumi.getter(name="spaceName")
    def space_name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the CodeCatalyst space.
        """
        return pulumi.get(self, "space_name")

    @space_name.setter
    def space_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "space_name", value)


class SourceRepository(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 project_name: Optional[pulumi.Input[str]] = None,
                 space_name: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Resource for managing an AWS CodeCatalyst Source Repository.

        ## Example Usage
        ### Basic Usage

        ```python
        import pulumi
        import pulumi_aws as aws

        example = aws.codecatalyst.SourceRepository("example",
            name="example-repo",
            project_name="example-project",
            space_name="example-space")
        ```

        ## Import

        Using `pulumi import`, import CodeCatalyst Source Repository using the `id`. For example:

        ```sh
         $ pulumi import aws:codecatalyst/sourceRepository:SourceRepository example example-repo
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] description: The description of the project. This description will be displayed to all users of the project. We recommend providing a brief description of the project and its intended purpose.
        :param pulumi.Input[str] name: The name of the source repository. For more information about name requirements, see [Quotas for source repositories](https://docs.aws.amazon.com/codecatalyst/latest/userguide/source-quotas.html).
        :param pulumi.Input[str] project_name: The name of the project in the CodeCatalyst space.
               
               The following arguments are optional:
        :param pulumi.Input[str] space_name: The name of the CodeCatalyst space.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: SourceRepositoryArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Resource for managing an AWS CodeCatalyst Source Repository.

        ## Example Usage
        ### Basic Usage

        ```python
        import pulumi
        import pulumi_aws as aws

        example = aws.codecatalyst.SourceRepository("example",
            name="example-repo",
            project_name="example-project",
            space_name="example-space")
        ```

        ## Import

        Using `pulumi import`, import CodeCatalyst Source Repository using the `id`. For example:

        ```sh
         $ pulumi import aws:codecatalyst/sourceRepository:SourceRepository example example-repo
        ```

        :param str resource_name: The name of the resource.
        :param SourceRepositoryArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(SourceRepositoryArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 project_name: Optional[pulumi.Input[str]] = None,
                 space_name: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = SourceRepositoryArgs.__new__(SourceRepositoryArgs)

            __props__.__dict__["description"] = description
            __props__.__dict__["name"] = name
            if project_name is None and not opts.urn:
                raise TypeError("Missing required property 'project_name'")
            __props__.__dict__["project_name"] = project_name
            if space_name is None and not opts.urn:
                raise TypeError("Missing required property 'space_name'")
            __props__.__dict__["space_name"] = space_name
        super(SourceRepository, __self__).__init__(
            'aws:codecatalyst/sourceRepository:SourceRepository',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            description: Optional[pulumi.Input[str]] = None,
            name: Optional[pulumi.Input[str]] = None,
            project_name: Optional[pulumi.Input[str]] = None,
            space_name: Optional[pulumi.Input[str]] = None) -> 'SourceRepository':
        """
        Get an existing SourceRepository resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] description: The description of the project. This description will be displayed to all users of the project. We recommend providing a brief description of the project and its intended purpose.
        :param pulumi.Input[str] name: The name of the source repository. For more information about name requirements, see [Quotas for source repositories](https://docs.aws.amazon.com/codecatalyst/latest/userguide/source-quotas.html).
        :param pulumi.Input[str] project_name: The name of the project in the CodeCatalyst space.
               
               The following arguments are optional:
        :param pulumi.Input[str] space_name: The name of the CodeCatalyst space.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _SourceRepositoryState.__new__(_SourceRepositoryState)

        __props__.__dict__["description"] = description
        __props__.__dict__["name"] = name
        __props__.__dict__["project_name"] = project_name
        __props__.__dict__["space_name"] = space_name
        return SourceRepository(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def description(self) -> pulumi.Output[Optional[str]]:
        """
        The description of the project. This description will be displayed to all users of the project. We recommend providing a brief description of the project and its intended purpose.
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        The name of the source repository. For more information about name requirements, see [Quotas for source repositories](https://docs.aws.amazon.com/codecatalyst/latest/userguide/source-quotas.html).
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="projectName")
    def project_name(self) -> pulumi.Output[str]:
        """
        The name of the project in the CodeCatalyst space.

        The following arguments are optional:
        """
        return pulumi.get(self, "project_name")

    @property
    @pulumi.getter(name="spaceName")
    def space_name(self) -> pulumi.Output[str]:
        """
        The name of the CodeCatalyst space.
        """
        return pulumi.get(self, "space_name")

