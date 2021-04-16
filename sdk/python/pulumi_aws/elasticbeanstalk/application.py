# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities
from . import outputs
from ._inputs import *

__all__ = ['ApplicationArgs', 'Application']

@pulumi.input_type
class ApplicationArgs:
    def __init__(__self__, *,
                 appversion_lifecycle: Optional[pulumi.Input['ApplicationAppversionLifecycleArgs']] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None):
        """
        The set of arguments for constructing a Application resource.
        :param pulumi.Input[str] description: Short description of the application
        :param pulumi.Input[str] name: The name of the application, must be unique within your account
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: Key-value map of tags for the Elastic Beanstalk Application.
        """
        if appversion_lifecycle is not None:
            pulumi.set(__self__, "appversion_lifecycle", appversion_lifecycle)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)

    @property
    @pulumi.getter(name="appversionLifecycle")
    def appversion_lifecycle(self) -> Optional[pulumi.Input['ApplicationAppversionLifecycleArgs']]:
        return pulumi.get(self, "appversion_lifecycle")

    @appversion_lifecycle.setter
    def appversion_lifecycle(self, value: Optional[pulumi.Input['ApplicationAppversionLifecycleArgs']]):
        pulumi.set(self, "appversion_lifecycle", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        Short description of the application
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the application, must be unique within your account
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        Key-value map of tags for the Elastic Beanstalk Application.
        """
        return pulumi.get(self, "tags")

    @tags.setter
    def tags(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "tags", value)


@pulumi.input_type
class _ApplicationState:
    def __init__(__self__, *,
                 appversion_lifecycle: Optional[pulumi.Input['ApplicationAppversionLifecycleArgs']] = None,
                 arn: Optional[pulumi.Input[str]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None):
        """
        Input properties used for looking up and filtering Application resources.
        :param pulumi.Input[str] arn: The ARN assigned by AWS for this Elastic Beanstalk Application.
        :param pulumi.Input[str] description: Short description of the application
        :param pulumi.Input[str] name: The name of the application, must be unique within your account
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: Key-value map of tags for the Elastic Beanstalk Application.
        """
        if appversion_lifecycle is not None:
            pulumi.set(__self__, "appversion_lifecycle", appversion_lifecycle)
        if arn is not None:
            pulumi.set(__self__, "arn", arn)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)

    @property
    @pulumi.getter(name="appversionLifecycle")
    def appversion_lifecycle(self) -> Optional[pulumi.Input['ApplicationAppversionLifecycleArgs']]:
        return pulumi.get(self, "appversion_lifecycle")

    @appversion_lifecycle.setter
    def appversion_lifecycle(self, value: Optional[pulumi.Input['ApplicationAppversionLifecycleArgs']]):
        pulumi.set(self, "appversion_lifecycle", value)

    @property
    @pulumi.getter
    def arn(self) -> Optional[pulumi.Input[str]]:
        """
        The ARN assigned by AWS for this Elastic Beanstalk Application.
        """
        return pulumi.get(self, "arn")

    @arn.setter
    def arn(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "arn", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        Short description of the application
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the application, must be unique within your account
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        Key-value map of tags for the Elastic Beanstalk Application.
        """
        return pulumi.get(self, "tags")

    @tags.setter
    def tags(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "tags", value)


class Application(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 appversion_lifecycle: Optional[pulumi.Input[pulumi.InputType['ApplicationAppversionLifecycleArgs']]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 __props__=None):
        """
        Provides an Elastic Beanstalk Application Resource. Elastic Beanstalk allows
        you to deploy and manage applications in the AWS cloud without worrying about
        the infrastructure that runs those applications.

        This resource creates an application that has one configuration template named
        `default`, and no application versions

        ## Example Usage

        ```python
        import pulumi
        import pulumi_aws as aws

        tftest = aws.elasticbeanstalk.Application("tftest",
            description="tf-test-desc",
            appversion_lifecycle=aws.elasticbeanstalk.ApplicationAppversionLifecycleArgs(
                service_role=aws_iam_role["beanstalk_service"]["arn"],
                max_count=128,
                delete_source_from_s3=True,
            ))
        ```

        ## Import

        Elastic Beanstalk Applications can be imported using the `name`, e.g.

        ```sh
         $ pulumi import aws:elasticbeanstalk/application:Application tf_test tf-test-name
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] description: Short description of the application
        :param pulumi.Input[str] name: The name of the application, must be unique within your account
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: Key-value map of tags for the Elastic Beanstalk Application.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: Optional[ApplicationArgs] = None,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides an Elastic Beanstalk Application Resource. Elastic Beanstalk allows
        you to deploy and manage applications in the AWS cloud without worrying about
        the infrastructure that runs those applications.

        This resource creates an application that has one configuration template named
        `default`, and no application versions

        ## Example Usage

        ```python
        import pulumi
        import pulumi_aws as aws

        tftest = aws.elasticbeanstalk.Application("tftest",
            description="tf-test-desc",
            appversion_lifecycle=aws.elasticbeanstalk.ApplicationAppversionLifecycleArgs(
                service_role=aws_iam_role["beanstalk_service"]["arn"],
                max_count=128,
                delete_source_from_s3=True,
            ))
        ```

        ## Import

        Elastic Beanstalk Applications can be imported using the `name`, e.g.

        ```sh
         $ pulumi import aws:elasticbeanstalk/application:Application tf_test tf-test-name
        ```

        :param str resource_name: The name of the resource.
        :param ApplicationArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(ApplicationArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 appversion_lifecycle: Optional[pulumi.Input[pulumi.InputType['ApplicationAppversionLifecycleArgs']]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 __props__=None):
        if opts is None:
            opts = pulumi.ResourceOptions()
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.version is None:
            opts.version = _utilities.get_version()
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = ApplicationArgs.__new__(ApplicationArgs)

            __props__.__dict__["appversion_lifecycle"] = appversion_lifecycle
            __props__.__dict__["description"] = description
            __props__.__dict__["name"] = name
            __props__.__dict__["tags"] = tags
            __props__.__dict__["arn"] = None
        super(Application, __self__).__init__(
            'aws:elasticbeanstalk/application:Application',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            appversion_lifecycle: Optional[pulumi.Input[pulumi.InputType['ApplicationAppversionLifecycleArgs']]] = None,
            arn: Optional[pulumi.Input[str]] = None,
            description: Optional[pulumi.Input[str]] = None,
            name: Optional[pulumi.Input[str]] = None,
            tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None) -> 'Application':
        """
        Get an existing Application resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] arn: The ARN assigned by AWS for this Elastic Beanstalk Application.
        :param pulumi.Input[str] description: Short description of the application
        :param pulumi.Input[str] name: The name of the application, must be unique within your account
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: Key-value map of tags for the Elastic Beanstalk Application.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _ApplicationState.__new__(_ApplicationState)

        __props__.__dict__["appversion_lifecycle"] = appversion_lifecycle
        __props__.__dict__["arn"] = arn
        __props__.__dict__["description"] = description
        __props__.__dict__["name"] = name
        __props__.__dict__["tags"] = tags
        return Application(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="appversionLifecycle")
    def appversion_lifecycle(self) -> pulumi.Output[Optional['outputs.ApplicationAppversionLifecycle']]:
        return pulumi.get(self, "appversion_lifecycle")

    @property
    @pulumi.getter
    def arn(self) -> pulumi.Output[str]:
        """
        The ARN assigned by AWS for this Elastic Beanstalk Application.
        """
        return pulumi.get(self, "arn")

    @property
    @pulumi.getter
    def description(self) -> pulumi.Output[Optional[str]]:
        """
        Short description of the application
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        The name of the application, must be unique within your account
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def tags(self) -> pulumi.Output[Optional[Mapping[str, str]]]:
        """
        Key-value map of tags for the Elastic Beanstalk Application.
        """
        return pulumi.get(self, "tags")

