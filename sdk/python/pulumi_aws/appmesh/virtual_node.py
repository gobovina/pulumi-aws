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

__all__ = ['VirtualNodeArgs', 'VirtualNode']

@pulumi.input_type
class VirtualNodeArgs:
    def __init__(__self__, *,
                 mesh_name: pulumi.Input[str],
                 spec: pulumi.Input['VirtualNodeSpecArgs'],
                 mesh_owner: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None):
        """
        The set of arguments for constructing a VirtualNode resource.
        :param pulumi.Input[str] mesh_name: Name of the service mesh in which to create the virtual node. Must be between 1 and 255 characters in length.
        :param pulumi.Input['VirtualNodeSpecArgs'] spec: Virtual node specification to apply.
        :param pulumi.Input[str] mesh_owner: AWS account ID of the service mesh's owner. Defaults to the account ID the AWS provider is currently connected to.
        :param pulumi.Input[str] name: Name to use for the virtual node. Must be between 1 and 255 characters in length.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: Map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        """
        pulumi.set(__self__, "mesh_name", mesh_name)
        pulumi.set(__self__, "spec", spec)
        if mesh_owner is not None:
            pulumi.set(__self__, "mesh_owner", mesh_owner)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)

    @property
    @pulumi.getter(name="meshName")
    def mesh_name(self) -> pulumi.Input[str]:
        """
        Name of the service mesh in which to create the virtual node. Must be between 1 and 255 characters in length.
        """
        return pulumi.get(self, "mesh_name")

    @mesh_name.setter
    def mesh_name(self, value: pulumi.Input[str]):
        pulumi.set(self, "mesh_name", value)

    @property
    @pulumi.getter
    def spec(self) -> pulumi.Input['VirtualNodeSpecArgs']:
        """
        Virtual node specification to apply.
        """
        return pulumi.get(self, "spec")

    @spec.setter
    def spec(self, value: pulumi.Input['VirtualNodeSpecArgs']):
        pulumi.set(self, "spec", value)

    @property
    @pulumi.getter(name="meshOwner")
    def mesh_owner(self) -> Optional[pulumi.Input[str]]:
        """
        AWS account ID of the service mesh's owner. Defaults to the account ID the AWS provider is currently connected to.
        """
        return pulumi.get(self, "mesh_owner")

    @mesh_owner.setter
    def mesh_owner(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "mesh_owner", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        Name to use for the virtual node. Must be between 1 and 255 characters in length.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

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
class _VirtualNodeState:
    def __init__(__self__, *,
                 arn: Optional[pulumi.Input[str]] = None,
                 created_date: Optional[pulumi.Input[str]] = None,
                 last_updated_date: Optional[pulumi.Input[str]] = None,
                 mesh_name: Optional[pulumi.Input[str]] = None,
                 mesh_owner: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 resource_owner: Optional[pulumi.Input[str]] = None,
                 spec: Optional[pulumi.Input['VirtualNodeSpecArgs']] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 tags_all: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None):
        """
        Input properties used for looking up and filtering VirtualNode resources.
        :param pulumi.Input[str] arn: ARN of the virtual node.
        :param pulumi.Input[str] created_date: Creation date of the virtual node.
        :param pulumi.Input[str] last_updated_date: Last update date of the virtual node.
        :param pulumi.Input[str] mesh_name: Name of the service mesh in which to create the virtual node. Must be between 1 and 255 characters in length.
        :param pulumi.Input[str] mesh_owner: AWS account ID of the service mesh's owner. Defaults to the account ID the AWS provider is currently connected to.
        :param pulumi.Input[str] name: Name to use for the virtual node. Must be between 1 and 255 characters in length.
        :param pulumi.Input[str] resource_owner: Resource owner's AWS account ID.
        :param pulumi.Input['VirtualNodeSpecArgs'] spec: Virtual node specification to apply.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: Map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags_all: Map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        """
        if arn is not None:
            pulumi.set(__self__, "arn", arn)
        if created_date is not None:
            pulumi.set(__self__, "created_date", created_date)
        if last_updated_date is not None:
            pulumi.set(__self__, "last_updated_date", last_updated_date)
        if mesh_name is not None:
            pulumi.set(__self__, "mesh_name", mesh_name)
        if mesh_owner is not None:
            pulumi.set(__self__, "mesh_owner", mesh_owner)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if resource_owner is not None:
            pulumi.set(__self__, "resource_owner", resource_owner)
        if spec is not None:
            pulumi.set(__self__, "spec", spec)
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
        ARN of the virtual node.
        """
        return pulumi.get(self, "arn")

    @arn.setter
    def arn(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "arn", value)

    @property
    @pulumi.getter(name="createdDate")
    def created_date(self) -> Optional[pulumi.Input[str]]:
        """
        Creation date of the virtual node.
        """
        return pulumi.get(self, "created_date")

    @created_date.setter
    def created_date(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "created_date", value)

    @property
    @pulumi.getter(name="lastUpdatedDate")
    def last_updated_date(self) -> Optional[pulumi.Input[str]]:
        """
        Last update date of the virtual node.
        """
        return pulumi.get(self, "last_updated_date")

    @last_updated_date.setter
    def last_updated_date(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "last_updated_date", value)

    @property
    @pulumi.getter(name="meshName")
    def mesh_name(self) -> Optional[pulumi.Input[str]]:
        """
        Name of the service mesh in which to create the virtual node. Must be between 1 and 255 characters in length.
        """
        return pulumi.get(self, "mesh_name")

    @mesh_name.setter
    def mesh_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "mesh_name", value)

    @property
    @pulumi.getter(name="meshOwner")
    def mesh_owner(self) -> Optional[pulumi.Input[str]]:
        """
        AWS account ID of the service mesh's owner. Defaults to the account ID the AWS provider is currently connected to.
        """
        return pulumi.get(self, "mesh_owner")

    @mesh_owner.setter
    def mesh_owner(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "mesh_owner", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        Name to use for the virtual node. Must be between 1 and 255 characters in length.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="resourceOwner")
    def resource_owner(self) -> Optional[pulumi.Input[str]]:
        """
        Resource owner's AWS account ID.
        """
        return pulumi.get(self, "resource_owner")

    @resource_owner.setter
    def resource_owner(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "resource_owner", value)

    @property
    @pulumi.getter
    def spec(self) -> Optional[pulumi.Input['VirtualNodeSpecArgs']]:
        """
        Virtual node specification to apply.
        """
        return pulumi.get(self, "spec")

    @spec.setter
    def spec(self, value: Optional[pulumi.Input['VirtualNodeSpecArgs']]):
        pulumi.set(self, "spec", value)

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


class VirtualNode(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 mesh_name: Optional[pulumi.Input[str]] = None,
                 mesh_owner: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 spec: Optional[pulumi.Input[pulumi.InputType['VirtualNodeSpecArgs']]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 __props__=None):
        """
        Provides an AWS App Mesh virtual node resource.

        ## Breaking Changes

        Because of backward incompatible API changes (read [here](https://github.com/awslabs/aws-app-mesh-examples/issues/92)), `appmesh.VirtualNode` resource definitions created with provider versions earlier than v2.3.0 will need to be modified:

        * Rename the `service_name` attribute of the `dns` object to `hostname`.

        * Replace the `backends` attribute of the `spec` object with one or more `backend` configuration blocks,
        setting `virtual_service_name` to the name of the service.

        The state associated with existing resources will automatically be migrated.

        ## Example Usage

        ### Basic

        <!--Start PulumiCodeChooser -->
        ```python
        import pulumi
        import pulumi_aws as aws

        serviceb1 = aws.appmesh.VirtualNode("serviceb1",
            name="serviceBv1",
            mesh_name=simple["id"],
            spec=aws.appmesh.VirtualNodeSpecArgs(
                backends=[aws.appmesh.VirtualNodeSpecBackendArgs(
                    virtual_service=aws.appmesh.VirtualNodeSpecBackendVirtualServiceArgs(
                        virtual_service_name="servicea.simpleapp.local",
                    ),
                )],
                listeners=[aws.appmesh.VirtualNodeSpecListenerArgs(
                    port_mapping=aws.appmesh.VirtualNodeSpecListenerPortMappingArgs(
                        port=8080,
                        protocol="http",
                    ),
                )],
                service_discovery=aws.appmesh.VirtualNodeSpecServiceDiscoveryArgs(
                    dns=aws.appmesh.VirtualNodeSpecServiceDiscoveryDnsArgs(
                        hostname="serviceb.simpleapp.local",
                    ),
                ),
            ))
        ```
        <!--End PulumiCodeChooser -->

        ### AWS Cloud Map Service Discovery

        <!--Start PulumiCodeChooser -->
        ```python
        import pulumi
        import pulumi_aws as aws

        example = aws.servicediscovery.HttpNamespace("example", name="example-ns")
        serviceb1 = aws.appmesh.VirtualNode("serviceb1",
            name="serviceBv1",
            mesh_name=simple["id"],
            spec=aws.appmesh.VirtualNodeSpecArgs(
                backends=[aws.appmesh.VirtualNodeSpecBackendArgs(
                    virtual_service=aws.appmesh.VirtualNodeSpecBackendVirtualServiceArgs(
                        virtual_service_name="servicea.simpleapp.local",
                    ),
                )],
                listeners=[aws.appmesh.VirtualNodeSpecListenerArgs(
                    port_mapping=aws.appmesh.VirtualNodeSpecListenerPortMappingArgs(
                        port=8080,
                        protocol="http",
                    ),
                )],
                service_discovery=aws.appmesh.VirtualNodeSpecServiceDiscoveryArgs(
                    aws_cloud_map=aws.appmesh.VirtualNodeSpecServiceDiscoveryAwsCloudMapArgs(
                        attributes={
                            "stack": "blue",
                        },
                        service_name="serviceb1",
                        namespace_name=example.name,
                    ),
                ),
            ))
        ```
        <!--End PulumiCodeChooser -->

        ### Listener Health Check

        <!--Start PulumiCodeChooser -->
        ```python
        import pulumi
        import pulumi_aws as aws

        serviceb1 = aws.appmesh.VirtualNode("serviceb1",
            name="serviceBv1",
            mesh_name=simple["id"],
            spec=aws.appmesh.VirtualNodeSpecArgs(
                backends=[aws.appmesh.VirtualNodeSpecBackendArgs(
                    virtual_service=aws.appmesh.VirtualNodeSpecBackendVirtualServiceArgs(
                        virtual_service_name="servicea.simpleapp.local",
                    ),
                )],
                listeners=[aws.appmesh.VirtualNodeSpecListenerArgs(
                    port_mapping=aws.appmesh.VirtualNodeSpecListenerPortMappingArgs(
                        port=8080,
                        protocol="http",
                    ),
                    health_check=aws.appmesh.VirtualNodeSpecListenerHealthCheckArgs(
                        protocol="http",
                        path="/ping",
                        healthy_threshold=2,
                        unhealthy_threshold=2,
                        timeout_millis=2000,
                        interval_millis=5000,
                    ),
                )],
                service_discovery=aws.appmesh.VirtualNodeSpecServiceDiscoveryArgs(
                    dns=aws.appmesh.VirtualNodeSpecServiceDiscoveryDnsArgs(
                        hostname="serviceb.simpleapp.local",
                    ),
                ),
            ))
        ```
        <!--End PulumiCodeChooser -->

        ### Logging

        <!--Start PulumiCodeChooser -->
        ```python
        import pulumi
        import pulumi_aws as aws

        serviceb1 = aws.appmesh.VirtualNode("serviceb1",
            name="serviceBv1",
            mesh_name=simple["id"],
            spec=aws.appmesh.VirtualNodeSpecArgs(
                backends=[aws.appmesh.VirtualNodeSpecBackendArgs(
                    virtual_service=aws.appmesh.VirtualNodeSpecBackendVirtualServiceArgs(
                        virtual_service_name="servicea.simpleapp.local",
                    ),
                )],
                listeners=[aws.appmesh.VirtualNodeSpecListenerArgs(
                    port_mapping=aws.appmesh.VirtualNodeSpecListenerPortMappingArgs(
                        port=8080,
                        protocol="http",
                    ),
                )],
                service_discovery=aws.appmesh.VirtualNodeSpecServiceDiscoveryArgs(
                    dns=aws.appmesh.VirtualNodeSpecServiceDiscoveryDnsArgs(
                        hostname="serviceb.simpleapp.local",
                    ),
                ),
                logging=aws.appmesh.VirtualNodeSpecLoggingArgs(
                    access_log=aws.appmesh.VirtualNodeSpecLoggingAccessLogArgs(
                        file=aws.appmesh.VirtualNodeSpecLoggingAccessLogFileArgs(
                            path="/dev/stdout",
                        ),
                    ),
                ),
            ))
        ```
        <!--End PulumiCodeChooser -->

        ## Import

        Using `pulumi import`, import App Mesh virtual nodes using `mesh_name` together with the virtual node's `name`. For example:

        ```sh
        $ pulumi import aws:appmesh/virtualNode:VirtualNode serviceb1 simpleapp/serviceBv1
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] mesh_name: Name of the service mesh in which to create the virtual node. Must be between 1 and 255 characters in length.
        :param pulumi.Input[str] mesh_owner: AWS account ID of the service mesh's owner. Defaults to the account ID the AWS provider is currently connected to.
        :param pulumi.Input[str] name: Name to use for the virtual node. Must be between 1 and 255 characters in length.
        :param pulumi.Input[pulumi.InputType['VirtualNodeSpecArgs']] spec: Virtual node specification to apply.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: Map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: VirtualNodeArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides an AWS App Mesh virtual node resource.

        ## Breaking Changes

        Because of backward incompatible API changes (read [here](https://github.com/awslabs/aws-app-mesh-examples/issues/92)), `appmesh.VirtualNode` resource definitions created with provider versions earlier than v2.3.0 will need to be modified:

        * Rename the `service_name` attribute of the `dns` object to `hostname`.

        * Replace the `backends` attribute of the `spec` object with one or more `backend` configuration blocks,
        setting `virtual_service_name` to the name of the service.

        The state associated with existing resources will automatically be migrated.

        ## Example Usage

        ### Basic

        <!--Start PulumiCodeChooser -->
        ```python
        import pulumi
        import pulumi_aws as aws

        serviceb1 = aws.appmesh.VirtualNode("serviceb1",
            name="serviceBv1",
            mesh_name=simple["id"],
            spec=aws.appmesh.VirtualNodeSpecArgs(
                backends=[aws.appmesh.VirtualNodeSpecBackendArgs(
                    virtual_service=aws.appmesh.VirtualNodeSpecBackendVirtualServiceArgs(
                        virtual_service_name="servicea.simpleapp.local",
                    ),
                )],
                listeners=[aws.appmesh.VirtualNodeSpecListenerArgs(
                    port_mapping=aws.appmesh.VirtualNodeSpecListenerPortMappingArgs(
                        port=8080,
                        protocol="http",
                    ),
                )],
                service_discovery=aws.appmesh.VirtualNodeSpecServiceDiscoveryArgs(
                    dns=aws.appmesh.VirtualNodeSpecServiceDiscoveryDnsArgs(
                        hostname="serviceb.simpleapp.local",
                    ),
                ),
            ))
        ```
        <!--End PulumiCodeChooser -->

        ### AWS Cloud Map Service Discovery

        <!--Start PulumiCodeChooser -->
        ```python
        import pulumi
        import pulumi_aws as aws

        example = aws.servicediscovery.HttpNamespace("example", name="example-ns")
        serviceb1 = aws.appmesh.VirtualNode("serviceb1",
            name="serviceBv1",
            mesh_name=simple["id"],
            spec=aws.appmesh.VirtualNodeSpecArgs(
                backends=[aws.appmesh.VirtualNodeSpecBackendArgs(
                    virtual_service=aws.appmesh.VirtualNodeSpecBackendVirtualServiceArgs(
                        virtual_service_name="servicea.simpleapp.local",
                    ),
                )],
                listeners=[aws.appmesh.VirtualNodeSpecListenerArgs(
                    port_mapping=aws.appmesh.VirtualNodeSpecListenerPortMappingArgs(
                        port=8080,
                        protocol="http",
                    ),
                )],
                service_discovery=aws.appmesh.VirtualNodeSpecServiceDiscoveryArgs(
                    aws_cloud_map=aws.appmesh.VirtualNodeSpecServiceDiscoveryAwsCloudMapArgs(
                        attributes={
                            "stack": "blue",
                        },
                        service_name="serviceb1",
                        namespace_name=example.name,
                    ),
                ),
            ))
        ```
        <!--End PulumiCodeChooser -->

        ### Listener Health Check

        <!--Start PulumiCodeChooser -->
        ```python
        import pulumi
        import pulumi_aws as aws

        serviceb1 = aws.appmesh.VirtualNode("serviceb1",
            name="serviceBv1",
            mesh_name=simple["id"],
            spec=aws.appmesh.VirtualNodeSpecArgs(
                backends=[aws.appmesh.VirtualNodeSpecBackendArgs(
                    virtual_service=aws.appmesh.VirtualNodeSpecBackendVirtualServiceArgs(
                        virtual_service_name="servicea.simpleapp.local",
                    ),
                )],
                listeners=[aws.appmesh.VirtualNodeSpecListenerArgs(
                    port_mapping=aws.appmesh.VirtualNodeSpecListenerPortMappingArgs(
                        port=8080,
                        protocol="http",
                    ),
                    health_check=aws.appmesh.VirtualNodeSpecListenerHealthCheckArgs(
                        protocol="http",
                        path="/ping",
                        healthy_threshold=2,
                        unhealthy_threshold=2,
                        timeout_millis=2000,
                        interval_millis=5000,
                    ),
                )],
                service_discovery=aws.appmesh.VirtualNodeSpecServiceDiscoveryArgs(
                    dns=aws.appmesh.VirtualNodeSpecServiceDiscoveryDnsArgs(
                        hostname="serviceb.simpleapp.local",
                    ),
                ),
            ))
        ```
        <!--End PulumiCodeChooser -->

        ### Logging

        <!--Start PulumiCodeChooser -->
        ```python
        import pulumi
        import pulumi_aws as aws

        serviceb1 = aws.appmesh.VirtualNode("serviceb1",
            name="serviceBv1",
            mesh_name=simple["id"],
            spec=aws.appmesh.VirtualNodeSpecArgs(
                backends=[aws.appmesh.VirtualNodeSpecBackendArgs(
                    virtual_service=aws.appmesh.VirtualNodeSpecBackendVirtualServiceArgs(
                        virtual_service_name="servicea.simpleapp.local",
                    ),
                )],
                listeners=[aws.appmesh.VirtualNodeSpecListenerArgs(
                    port_mapping=aws.appmesh.VirtualNodeSpecListenerPortMappingArgs(
                        port=8080,
                        protocol="http",
                    ),
                )],
                service_discovery=aws.appmesh.VirtualNodeSpecServiceDiscoveryArgs(
                    dns=aws.appmesh.VirtualNodeSpecServiceDiscoveryDnsArgs(
                        hostname="serviceb.simpleapp.local",
                    ),
                ),
                logging=aws.appmesh.VirtualNodeSpecLoggingArgs(
                    access_log=aws.appmesh.VirtualNodeSpecLoggingAccessLogArgs(
                        file=aws.appmesh.VirtualNodeSpecLoggingAccessLogFileArgs(
                            path="/dev/stdout",
                        ),
                    ),
                ),
            ))
        ```
        <!--End PulumiCodeChooser -->

        ## Import

        Using `pulumi import`, import App Mesh virtual nodes using `mesh_name` together with the virtual node's `name`. For example:

        ```sh
        $ pulumi import aws:appmesh/virtualNode:VirtualNode serviceb1 simpleapp/serviceBv1
        ```

        :param str resource_name: The name of the resource.
        :param VirtualNodeArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(VirtualNodeArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 mesh_name: Optional[pulumi.Input[str]] = None,
                 mesh_owner: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 spec: Optional[pulumi.Input[pulumi.InputType['VirtualNodeSpecArgs']]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = VirtualNodeArgs.__new__(VirtualNodeArgs)

            if mesh_name is None and not opts.urn:
                raise TypeError("Missing required property 'mesh_name'")
            __props__.__dict__["mesh_name"] = mesh_name
            __props__.__dict__["mesh_owner"] = mesh_owner
            __props__.__dict__["name"] = name
            if spec is None and not opts.urn:
                raise TypeError("Missing required property 'spec'")
            __props__.__dict__["spec"] = spec
            __props__.__dict__["tags"] = tags
            __props__.__dict__["arn"] = None
            __props__.__dict__["created_date"] = None
            __props__.__dict__["last_updated_date"] = None
            __props__.__dict__["resource_owner"] = None
            __props__.__dict__["tags_all"] = None
        super(VirtualNode, __self__).__init__(
            'aws:appmesh/virtualNode:VirtualNode',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            arn: Optional[pulumi.Input[str]] = None,
            created_date: Optional[pulumi.Input[str]] = None,
            last_updated_date: Optional[pulumi.Input[str]] = None,
            mesh_name: Optional[pulumi.Input[str]] = None,
            mesh_owner: Optional[pulumi.Input[str]] = None,
            name: Optional[pulumi.Input[str]] = None,
            resource_owner: Optional[pulumi.Input[str]] = None,
            spec: Optional[pulumi.Input[pulumi.InputType['VirtualNodeSpecArgs']]] = None,
            tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
            tags_all: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None) -> 'VirtualNode':
        """
        Get an existing VirtualNode resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] arn: ARN of the virtual node.
        :param pulumi.Input[str] created_date: Creation date of the virtual node.
        :param pulumi.Input[str] last_updated_date: Last update date of the virtual node.
        :param pulumi.Input[str] mesh_name: Name of the service mesh in which to create the virtual node. Must be between 1 and 255 characters in length.
        :param pulumi.Input[str] mesh_owner: AWS account ID of the service mesh's owner. Defaults to the account ID the AWS provider is currently connected to.
        :param pulumi.Input[str] name: Name to use for the virtual node. Must be between 1 and 255 characters in length.
        :param pulumi.Input[str] resource_owner: Resource owner's AWS account ID.
        :param pulumi.Input[pulumi.InputType['VirtualNodeSpecArgs']] spec: Virtual node specification to apply.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: Map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags_all: Map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _VirtualNodeState.__new__(_VirtualNodeState)

        __props__.__dict__["arn"] = arn
        __props__.__dict__["created_date"] = created_date
        __props__.__dict__["last_updated_date"] = last_updated_date
        __props__.__dict__["mesh_name"] = mesh_name
        __props__.__dict__["mesh_owner"] = mesh_owner
        __props__.__dict__["name"] = name
        __props__.__dict__["resource_owner"] = resource_owner
        __props__.__dict__["spec"] = spec
        __props__.__dict__["tags"] = tags
        __props__.__dict__["tags_all"] = tags_all
        return VirtualNode(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def arn(self) -> pulumi.Output[str]:
        """
        ARN of the virtual node.
        """
        return pulumi.get(self, "arn")

    @property
    @pulumi.getter(name="createdDate")
    def created_date(self) -> pulumi.Output[str]:
        """
        Creation date of the virtual node.
        """
        return pulumi.get(self, "created_date")

    @property
    @pulumi.getter(name="lastUpdatedDate")
    def last_updated_date(self) -> pulumi.Output[str]:
        """
        Last update date of the virtual node.
        """
        return pulumi.get(self, "last_updated_date")

    @property
    @pulumi.getter(name="meshName")
    def mesh_name(self) -> pulumi.Output[str]:
        """
        Name of the service mesh in which to create the virtual node. Must be between 1 and 255 characters in length.
        """
        return pulumi.get(self, "mesh_name")

    @property
    @pulumi.getter(name="meshOwner")
    def mesh_owner(self) -> pulumi.Output[str]:
        """
        AWS account ID of the service mesh's owner. Defaults to the account ID the AWS provider is currently connected to.
        """
        return pulumi.get(self, "mesh_owner")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        Name to use for the virtual node. Must be between 1 and 255 characters in length.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="resourceOwner")
    def resource_owner(self) -> pulumi.Output[str]:
        """
        Resource owner's AWS account ID.
        """
        return pulumi.get(self, "resource_owner")

    @property
    @pulumi.getter
    def spec(self) -> pulumi.Output['outputs.VirtualNodeSpec']:
        """
        Virtual node specification to apply.
        """
        return pulumi.get(self, "spec")

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

