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

__all__ = ['ApplicationArgs', 'Application']

@pulumi.input_type
class ApplicationArgs:
    def __init__(__self__, *,
                 application_provider_arn: pulumi.Input[str],
                 instance_arn: pulumi.Input[str],
                 client_token: Optional[pulumi.Input[str]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 portal_options: Optional[pulumi.Input['ApplicationPortalOptionsArgs']] = None,
                 status: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None):
        """
        The set of arguments for constructing a Application resource.
        :param pulumi.Input[str] application_provider_arn: ARN of the application provider.
        :param pulumi.Input[str] instance_arn: ARN of the instance of IAM Identity Center.
        :param pulumi.Input[str] client_token: A unique, case-sensitive ID that you provide to ensure the idempotency of the request. AWS generates a random value when not provided.
        :param pulumi.Input[str] description: Description of the application.
        :param pulumi.Input[str] name: Name of the application.
               
               The following arguments are optional:
        :param pulumi.Input['ApplicationPortalOptionsArgs'] portal_options: Options for the portal associated with an application. See `portal_options` below.
        :param pulumi.Input[str] status: Status of the application. Valid values are `ENABLED` and `DISABLED`.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: Key-value mapping of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        """
        pulumi.set(__self__, "application_provider_arn", application_provider_arn)
        pulumi.set(__self__, "instance_arn", instance_arn)
        if client_token is not None:
            pulumi.set(__self__, "client_token", client_token)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if portal_options is not None:
            pulumi.set(__self__, "portal_options", portal_options)
        if status is not None:
            pulumi.set(__self__, "status", status)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)

    @property
    @pulumi.getter(name="applicationProviderArn")
    def application_provider_arn(self) -> pulumi.Input[str]:
        """
        ARN of the application provider.
        """
        return pulumi.get(self, "application_provider_arn")

    @application_provider_arn.setter
    def application_provider_arn(self, value: pulumi.Input[str]):
        pulumi.set(self, "application_provider_arn", value)

    @property
    @pulumi.getter(name="instanceArn")
    def instance_arn(self) -> pulumi.Input[str]:
        """
        ARN of the instance of IAM Identity Center.
        """
        return pulumi.get(self, "instance_arn")

    @instance_arn.setter
    def instance_arn(self, value: pulumi.Input[str]):
        pulumi.set(self, "instance_arn", value)

    @property
    @pulumi.getter(name="clientToken")
    def client_token(self) -> Optional[pulumi.Input[str]]:
        """
        A unique, case-sensitive ID that you provide to ensure the idempotency of the request. AWS generates a random value when not provided.
        """
        return pulumi.get(self, "client_token")

    @client_token.setter
    def client_token(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "client_token", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        Description of the application.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        Name of the application.

        The following arguments are optional:
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="portalOptions")
    def portal_options(self) -> Optional[pulumi.Input['ApplicationPortalOptionsArgs']]:
        """
        Options for the portal associated with an application. See `portal_options` below.
        """
        return pulumi.get(self, "portal_options")

    @portal_options.setter
    def portal_options(self, value: Optional[pulumi.Input['ApplicationPortalOptionsArgs']]):
        pulumi.set(self, "portal_options", value)

    @property
    @pulumi.getter
    def status(self) -> Optional[pulumi.Input[str]]:
        """
        Status of the application. Valid values are `ENABLED` and `DISABLED`.
        """
        return pulumi.get(self, "status")

    @status.setter
    def status(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "status", value)

    @property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        Key-value mapping of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        """
        return pulumi.get(self, "tags")

    @tags.setter
    def tags(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "tags", value)


@pulumi.input_type
class _ApplicationState:
    def __init__(__self__, *,
                 application_account: Optional[pulumi.Input[str]] = None,
                 application_arn: Optional[pulumi.Input[str]] = None,
                 application_provider_arn: Optional[pulumi.Input[str]] = None,
                 client_token: Optional[pulumi.Input[str]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 instance_arn: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 portal_options: Optional[pulumi.Input['ApplicationPortalOptionsArgs']] = None,
                 status: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 tags_all: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None):
        """
        Input properties used for looking up and filtering Application resources.
        :param pulumi.Input[str] application_account: AWS account ID.
        :param pulumi.Input[str] application_arn: ARN of the application.
        :param pulumi.Input[str] application_provider_arn: ARN of the application provider.
        :param pulumi.Input[str] client_token: A unique, case-sensitive ID that you provide to ensure the idempotency of the request. AWS generates a random value when not provided.
        :param pulumi.Input[str] description: Description of the application.
        :param pulumi.Input[str] instance_arn: ARN of the instance of IAM Identity Center.
        :param pulumi.Input[str] name: Name of the application.
               
               The following arguments are optional:
        :param pulumi.Input['ApplicationPortalOptionsArgs'] portal_options: Options for the portal associated with an application. See `portal_options` below.
        :param pulumi.Input[str] status: Status of the application. Valid values are `ENABLED` and `DISABLED`.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: Key-value mapping of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags_all: Map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        """
        if application_account is not None:
            pulumi.set(__self__, "application_account", application_account)
        if application_arn is not None:
            pulumi.set(__self__, "application_arn", application_arn)
        if application_provider_arn is not None:
            pulumi.set(__self__, "application_provider_arn", application_provider_arn)
        if client_token is not None:
            pulumi.set(__self__, "client_token", client_token)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if instance_arn is not None:
            pulumi.set(__self__, "instance_arn", instance_arn)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if portal_options is not None:
            pulumi.set(__self__, "portal_options", portal_options)
        if status is not None:
            pulumi.set(__self__, "status", status)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)
        if tags_all is not None:
            warnings.warn("""Please use `tags` instead.""", DeprecationWarning)
            pulumi.log.warn("""tags_all is deprecated: Please use `tags` instead.""")
        if tags_all is not None:
            pulumi.set(__self__, "tags_all", tags_all)

    @property
    @pulumi.getter(name="applicationAccount")
    def application_account(self) -> Optional[pulumi.Input[str]]:
        """
        AWS account ID.
        """
        return pulumi.get(self, "application_account")

    @application_account.setter
    def application_account(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "application_account", value)

    @property
    @pulumi.getter(name="applicationArn")
    def application_arn(self) -> Optional[pulumi.Input[str]]:
        """
        ARN of the application.
        """
        return pulumi.get(self, "application_arn")

    @application_arn.setter
    def application_arn(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "application_arn", value)

    @property
    @pulumi.getter(name="applicationProviderArn")
    def application_provider_arn(self) -> Optional[pulumi.Input[str]]:
        """
        ARN of the application provider.
        """
        return pulumi.get(self, "application_provider_arn")

    @application_provider_arn.setter
    def application_provider_arn(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "application_provider_arn", value)

    @property
    @pulumi.getter(name="clientToken")
    def client_token(self) -> Optional[pulumi.Input[str]]:
        """
        A unique, case-sensitive ID that you provide to ensure the idempotency of the request. AWS generates a random value when not provided.
        """
        return pulumi.get(self, "client_token")

    @client_token.setter
    def client_token(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "client_token", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        Description of the application.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter(name="instanceArn")
    def instance_arn(self) -> Optional[pulumi.Input[str]]:
        """
        ARN of the instance of IAM Identity Center.
        """
        return pulumi.get(self, "instance_arn")

    @instance_arn.setter
    def instance_arn(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "instance_arn", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        Name of the application.

        The following arguments are optional:
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="portalOptions")
    def portal_options(self) -> Optional[pulumi.Input['ApplicationPortalOptionsArgs']]:
        """
        Options for the portal associated with an application. See `portal_options` below.
        """
        return pulumi.get(self, "portal_options")

    @portal_options.setter
    def portal_options(self, value: Optional[pulumi.Input['ApplicationPortalOptionsArgs']]):
        pulumi.set(self, "portal_options", value)

    @property
    @pulumi.getter
    def status(self) -> Optional[pulumi.Input[str]]:
        """
        Status of the application. Valid values are `ENABLED` and `DISABLED`.
        """
        return pulumi.get(self, "status")

    @status.setter
    def status(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "status", value)

    @property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        Key-value mapping of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
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


class Application(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 application_provider_arn: Optional[pulumi.Input[str]] = None,
                 client_token: Optional[pulumi.Input[str]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 instance_arn: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 portal_options: Optional[pulumi.Input[pulumi.InputType['ApplicationPortalOptionsArgs']]] = None,
                 status: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 __props__=None):
        """
        Resource for managing an AWS SSO Admin Application.

        > The `CreateApplication` API only supports custom OAuth 2.0 applications.
        Creation of 3rd party SAML or OAuth 2.0 applications require setup to be done through the associated app service or AWS console.
        See this issue for additional context.

        ## Example Usage

        ## Import

        Using `pulumi import`, import SSO Admin Application using the `id`. For example:

        ```sh
         $ pulumi import aws:ssoadmin/application:Application example arn:aws:sso::012345678901:application/id-12345678
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] application_provider_arn: ARN of the application provider.
        :param pulumi.Input[str] client_token: A unique, case-sensitive ID that you provide to ensure the idempotency of the request. AWS generates a random value when not provided.
        :param pulumi.Input[str] description: Description of the application.
        :param pulumi.Input[str] instance_arn: ARN of the instance of IAM Identity Center.
        :param pulumi.Input[str] name: Name of the application.
               
               The following arguments are optional:
        :param pulumi.Input[pulumi.InputType['ApplicationPortalOptionsArgs']] portal_options: Options for the portal associated with an application. See `portal_options` below.
        :param pulumi.Input[str] status: Status of the application. Valid values are `ENABLED` and `DISABLED`.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: Key-value mapping of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: ApplicationArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Resource for managing an AWS SSO Admin Application.

        > The `CreateApplication` API only supports custom OAuth 2.0 applications.
        Creation of 3rd party SAML or OAuth 2.0 applications require setup to be done through the associated app service or AWS console.
        See this issue for additional context.

        ## Example Usage

        ## Import

        Using `pulumi import`, import SSO Admin Application using the `id`. For example:

        ```sh
         $ pulumi import aws:ssoadmin/application:Application example arn:aws:sso::012345678901:application/id-12345678
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
                 application_provider_arn: Optional[pulumi.Input[str]] = None,
                 client_token: Optional[pulumi.Input[str]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 instance_arn: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 portal_options: Optional[pulumi.Input[pulumi.InputType['ApplicationPortalOptionsArgs']]] = None,
                 status: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = ApplicationArgs.__new__(ApplicationArgs)

            if application_provider_arn is None and not opts.urn:
                raise TypeError("Missing required property 'application_provider_arn'")
            __props__.__dict__["application_provider_arn"] = application_provider_arn
            __props__.__dict__["client_token"] = client_token
            __props__.__dict__["description"] = description
            if instance_arn is None and not opts.urn:
                raise TypeError("Missing required property 'instance_arn'")
            __props__.__dict__["instance_arn"] = instance_arn
            __props__.__dict__["name"] = name
            __props__.__dict__["portal_options"] = portal_options
            __props__.__dict__["status"] = status
            __props__.__dict__["tags"] = tags
            __props__.__dict__["application_account"] = None
            __props__.__dict__["application_arn"] = None
            __props__.__dict__["tags_all"] = None
        super(Application, __self__).__init__(
            'aws:ssoadmin/application:Application',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            application_account: Optional[pulumi.Input[str]] = None,
            application_arn: Optional[pulumi.Input[str]] = None,
            application_provider_arn: Optional[pulumi.Input[str]] = None,
            client_token: Optional[pulumi.Input[str]] = None,
            description: Optional[pulumi.Input[str]] = None,
            instance_arn: Optional[pulumi.Input[str]] = None,
            name: Optional[pulumi.Input[str]] = None,
            portal_options: Optional[pulumi.Input[pulumi.InputType['ApplicationPortalOptionsArgs']]] = None,
            status: Optional[pulumi.Input[str]] = None,
            tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
            tags_all: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None) -> 'Application':
        """
        Get an existing Application resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] application_account: AWS account ID.
        :param pulumi.Input[str] application_arn: ARN of the application.
        :param pulumi.Input[str] application_provider_arn: ARN of the application provider.
        :param pulumi.Input[str] client_token: A unique, case-sensitive ID that you provide to ensure the idempotency of the request. AWS generates a random value when not provided.
        :param pulumi.Input[str] description: Description of the application.
        :param pulumi.Input[str] instance_arn: ARN of the instance of IAM Identity Center.
        :param pulumi.Input[str] name: Name of the application.
               
               The following arguments are optional:
        :param pulumi.Input[pulumi.InputType['ApplicationPortalOptionsArgs']] portal_options: Options for the portal associated with an application. See `portal_options` below.
        :param pulumi.Input[str] status: Status of the application. Valid values are `ENABLED` and `DISABLED`.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: Key-value mapping of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags_all: Map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _ApplicationState.__new__(_ApplicationState)

        __props__.__dict__["application_account"] = application_account
        __props__.__dict__["application_arn"] = application_arn
        __props__.__dict__["application_provider_arn"] = application_provider_arn
        __props__.__dict__["client_token"] = client_token
        __props__.__dict__["description"] = description
        __props__.__dict__["instance_arn"] = instance_arn
        __props__.__dict__["name"] = name
        __props__.__dict__["portal_options"] = portal_options
        __props__.__dict__["status"] = status
        __props__.__dict__["tags"] = tags
        __props__.__dict__["tags_all"] = tags_all
        return Application(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="applicationAccount")
    def application_account(self) -> pulumi.Output[str]:
        """
        AWS account ID.
        """
        return pulumi.get(self, "application_account")

    @property
    @pulumi.getter(name="applicationArn")
    def application_arn(self) -> pulumi.Output[str]:
        """
        ARN of the application.
        """
        return pulumi.get(self, "application_arn")

    @property
    @pulumi.getter(name="applicationProviderArn")
    def application_provider_arn(self) -> pulumi.Output[str]:
        """
        ARN of the application provider.
        """
        return pulumi.get(self, "application_provider_arn")

    @property
    @pulumi.getter(name="clientToken")
    def client_token(self) -> pulumi.Output[Optional[str]]:
        """
        A unique, case-sensitive ID that you provide to ensure the idempotency of the request. AWS generates a random value when not provided.
        """
        return pulumi.get(self, "client_token")

    @property
    @pulumi.getter
    def description(self) -> pulumi.Output[Optional[str]]:
        """
        Description of the application.
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter(name="instanceArn")
    def instance_arn(self) -> pulumi.Output[str]:
        """
        ARN of the instance of IAM Identity Center.
        """
        return pulumi.get(self, "instance_arn")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        Name of the application.

        The following arguments are optional:
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="portalOptions")
    def portal_options(self) -> pulumi.Output[Optional['outputs.ApplicationPortalOptions']]:
        """
        Options for the portal associated with an application. See `portal_options` below.
        """
        return pulumi.get(self, "portal_options")

    @property
    @pulumi.getter
    def status(self) -> pulumi.Output[str]:
        """
        Status of the application. Valid values are `ENABLED` and `DISABLED`.
        """
        return pulumi.get(self, "status")

    @property
    @pulumi.getter
    def tags(self) -> pulumi.Output[Optional[Mapping[str, str]]]:
        """
        Key-value mapping of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
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

